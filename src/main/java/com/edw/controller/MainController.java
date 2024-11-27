package com.edw.controller;

import com.edw.bean.User;
import org.infinispan.Cache;
import org.infinispan.configuration.cache.CacheMode;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <pre>
 *  com.edw.controller.MainController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Nov 2024 22:39
 */
@RestController
public class MainController {

    @Autowired
    private EmbeddedCacheManager cacheManager;

    @GetMapping(path = "/")
    public HashMap index() {
        return new HashMap(){{
            put("hello", "world");
        }};
    }

    @GetMapping(path = "/get-user/{key}")
    public ResponseEntity getUser(@PathVariable String key) {
        Cache myCache = cacheManager.getCache("user-cache");
        return ResponseEntity.ok((User)myCache.getOrDefault(key, new User()));
    }

    @GetMapping(path = "/rebuild")
    public ResponseEntity rebuild() {
        cacheManager.removeCache("user-cache");
        cacheManager.createCache("user-cache", new ConfigurationBuilder()
                .indexing().enable()
                .addIndexedEntities("com.edw.bean.User")
                .clustering()
                .cacheMode(CacheMode.DIST_SYNC)
                    .hash()
                    .numOwners(2)
                .build());
        return ResponseEntity.ok().build();
    }
}
