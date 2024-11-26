package com.edw.config;

import org.infinispan.notifications.Listener;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryCreated;
import org.infinispan.notifications.cachelistener.event.CacheEntryCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *  com.edw.config.MyCustomListener
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Nov 2024 22:52
 */
@Listener(clustered = true)
public class MyCustomListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @CacheEntryCreated
    public void print(CacheEntryCreatedEvent event) {
        logger.debug("MyCustomListener called with key: {} and value {} ", event.getKey(), event.getValue());
    }

}
