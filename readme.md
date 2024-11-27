# Spring 2 and Infinispan 14 Library Mode with Prometheus Endpoint

## Check Prometheus Endpoint
```
$ curl http://localhost:8080/actuator/prometheus
```

## Application Logs
```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.3)

27-11-2024 10:58:37 [main] INFO  com.edw.Main.logStarting - Starting Main using Java 17.0.6 on DESKTOP-8NNFTMF with PID 8140 (spring-boot-and-infinispan-library-mode\target\classes started by EDWIN in spring-boot-and-infinispan-library-mode)
27-11-2024 10:58:37 [main] DEBUG com.edw.Main.logStarting - Running with Spring Boot v2.7.3, Spring v5.3.22
27-11-2024 10:58:37 [main] INFO  com.edw.Main.logStartupProfileInfo - No active profile set, falling back to 1 default profile: "default"
27-11-2024 10:58:38 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize - Tomcat initialized with port(s): 8081 (http)
27-11-2024 10:58:38 [main] INFO  org.apache.catalina.core.StandardService.log - Starting service [Tomcat]
27-11-2024 10:58:38 [main] INFO  org.apache.catalina.core.StandardEngine.log - Starting Servlet engine: [Apache Tomcat/9.0.65]
27-11-2024 10:58:38 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/].log - Initializing Spring embedded WebApplicationContext
27-11-2024 10:58:38 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.prepareWebApplicationContext - Root WebApplicationContext: initialization completed in 1437 ms
27-11-2024 10:58:39 [main] WARN  org.infinispan.CONFIG.validate - ISPN000625: Index path not provided and global state disabled, will use the current working directory for storage.
27-11-2024 10:58:39 [main] INFO  org.infinispan.CONTAINER.start - ISPN000556: Starting user marshaller 'org.infinispan.commons.marshall.JavaSerializationMarshaller'
27-11-2024 10:58:41 [main] INFO  org.infinispan.CLUSTER.startJGroupsChannelIfNeeded - ISPN000078: Starting JGroups channel `ISPN`
27-11-2024 10:58:41 [main] INFO  org.jgroups.JChannel.info - local_addr: 55ec9561-85cf-48a7-8323-182067963e0f, name: DESKTOP-8NNFTMF-65407

-------------------------------------------------------------------
GMS: address=DESKTOP-8NNFTMF-65407, cluster=ISPN, physical address=127.0.0.1:61606
-------------------------------------------------------------------
27-11-2024 10:58:41 [main] INFO  org.infinispan.CLUSTER.receiveClusterView - ISPN000094: Received new cluster view for channel ISPN: [DESKTOP-8NNFTMF-1774|1] (2) [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407]
27-11-2024 10:58:41 [main] INFO  org.infinispan.CLUSTER.startJGroupsChannelIfNeeded - ISPN000079: Channel `ISPN` local address is `DESKTOP-8NNFTMF-65407`, physical addresses are `[127.0.0.1:61606]`
27-11-2024 10:58:41 [main] WARN  org.infinispan.CONFIG.registerInternalCache - ISPN000569: Unable to persist Infinispan internal caches as no global state enabled
27-11-2024 10:58:42 [jgroups-10,DESKTOP-8NNFTMF-65407] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.PERMISSIONS] ISPN100002: Starting rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], phase READ_OLD_WRITE_ALL, topology id 2
27-11-2024 10:58:42 [non-blocking-thread--p2-t5] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.PERMISSIONS] ISPN100010: Finished rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], topology id 2
27-11-2024 10:58:42 [jgroups-11,DESKTOP-8NNFTMF-65407] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.ROLES] ISPN100002: Starting rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], phase READ_OLD_WRITE_ALL, topology id 2
27-11-2024 10:58:42 [non-blocking-thread--p2-t8] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.ROLES] ISPN100010: Finished rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], topology id 2
27-11-2024 10:58:42 [jgroups-11,DESKTOP-8NNFTMF-65407] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.CONFIG] ISPN100002: Starting rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], phase READ_OLD_WRITE_ALL, topology id 2
27-11-2024 10:58:42 [non-blocking-thread--p2-t11] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.CONFIG] ISPN100010: Finished rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], topology id 2
27-11-2024 10:58:42 [jgroups-10,DESKTOP-8NNFTMF-65407] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.LOCKS] ISPN100002: Starting rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], phase READ_OLD_WRITE_ALL, topology id 2
27-11-2024 10:58:42 [non-blocking-thread--p2-t15] INFO  org.infinispan.LIFECYCLE.log - [Context=org.infinispan.LOCKS] ISPN100010: Finished rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], topology id 2
27-11-2024 10:58:42 [main] INFO  org.hibernate.annotations.common.Version.<clinit> - HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
27-11-2024 10:58:42 [main] INFO  org.jboss.threads.<clinit> - JBoss Threads version 2.3.3.Final
27-11-2024 10:58:42 [main] INFO  org.infinispan.CONTAINER.createQueryInterceptorIfNeeded - ISPN014003: Registering Query interceptor for cache user-cache
27-11-2024 10:58:42 [jgroups-10,DESKTOP-8NNFTMF-65407] INFO  org.infinispan.LIFECYCLE.log - [Context=user-cache] ISPN100002: Starting rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], phase READ_OLD_WRITE_ALL, topology id 2
27-11-2024 10:58:42 [jgroups-16,DESKTOP-8NNFTMF-65407] INFO  org.infinispan.LIFECYCLE.log - [Context=user-cache] ISPN100010: Finished rebalance with members [DESKTOP-8NNFTMF-1774, DESKTOP-8NNFTMF-65407], topology id 2
27-11-2024 10:58:43 [main] INFO  org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver.<init> - Exposing 14 endpoint(s) beneath base path '/actuator'
27-11-2024 10:58:43 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer.start - Tomcat started on port(s): 8081 (http) with context path ''
27-11-2024 10:58:43 [main] INFO  com.edw.Main.logStarted - Started Main in 6.685 seconds (JVM running for 7.594)
27-11-2024 10:58:43 [RMI TCP Connection(1)-192.168.1.7] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/].log - Initializing Spring DispatcherServlet 'dispatcherServlet'
27-11-2024 10:58:43 [RMI TCP Connection(1)-192.168.1.7] INFO  org.springframework.web.servlet.DispatcherServlet.initServletBean - Initializing Servlet 'dispatcherServlet'
27-11-2024 10:58:43 [RMI TCP Connection(1)-192.168.1.7] INFO  org.springframework.web.servlet.DispatcherServlet.initServletBean - Completed initialization in 1 ms
```