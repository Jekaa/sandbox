# Read Me First
The following was discovered as part of building this project:

* Spring Cloud Gateway requires Spring WebFlux, your choice of Spring Web has been replaced accordingly.
* The following dependencies are not known to work with Spring Native: 'Spring Boot DevTools, Spring Configuration Processor, Rest Repositories, Rest Repositories HAL Explorer, Spring HATEOAS, Spring Web Services, Jersey, Apache Freemarker, Groovy Templates, Spring LDAP, MyBatis Framework, Liquibase Migration, Flyway Migration, JOOQ Access Layer, IBM DB2 Driver, Apache Derby Database, MariaDB Driver, MS SQL Server Driver, Oracle Driver, Spring Data for Apache Cassandra, Spring Data Reactive for Apache Cassandra, Spring for Apache Geode, Spring Data Couchbase, Spring Data Reactive Couchbase, Spring Integration, Spring for RabbitMQ, Spring for Apache ActiveMQ 5, Spring for Apache ActiveMQ Artemis, Spring Batch, Quartz Scheduler, Spring cache abstraction, Datadog, Influx, Graphite, New Relic, Prometheus, Zipkin Client, Testcontainers, Contract Verifier, Contract Stub Runner, Embedded LDAP Server, Embedded MongoDB Database, Cloud Bootstrap, Task, Vault Configuration, Apache Zookeeper Configuration, Consul Configuration, Eureka Discovery Client, Eureka Server, Apache Zookeeper Discovery, Cloud Foundry Discovery, Consul Discovery, Gateway, OpenFeign, Cloud LoadBalancer, Cloud Bus, Cloud Stream'. As a result, your application may not work as expected.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/#build-image)
* [Spring Integration JMS Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jms.html)
* [Spring Integration AMQP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/amqp.html)
* [Spring Integration JDBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jdbc.html)
* [Spring Integration JPA Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jpa.html)
* [Spring Integration MongoDB Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mongodb.html)
* [Spring Integration R2DBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/r2dbc.html)
* [Spring Integration Redis Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/redis.html)
* [Spring Integration Apache Geode Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/gemfire.html)
* [Spring Integration Test Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/testing.html)
* [Spring Integration Apache Kafka Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/kafka.html)
* [Spring Integration Mail Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mail.html)
* [Spring Integration RSocket Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/rsocket.html)
* [Spring Integration Security Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/security.html)
* [Spring Integration WebFlux Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/webflux.html)
* [Spring Integration STOMP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/stomp.html)
* [Spring Integration WebSocket Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/websocket.html)
* [Spring Integration Web Services Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/ws.html)
* [Testcontainers RabbitMQ Module Reference Guide](https://www.testcontainers.org/modules/rabbitmq/)
* [Testcontainers Cassandra Module Reference Guide](https://www.testcontainers.org/modules/databases/cassandra/)
* [Testcontainers Couchbase Module Reference Guide](https://www.testcontainers.org/modules/databases/couchbase/)
* [Testcontainers Elasticsearch Container Reference Guide](https://www.testcontainers.org/modules/elasticsearch/)
* [Testcontainers MongoDB Module Reference Guide](https://www.testcontainers.org/modules/databases/mongodb/)
* [Testcontainers Neo4j Module Reference Guide](https://www.testcontainers.org/modules/databases/neo4j/)
* [Testcontainers R2DBC support Reference Guide](https://www.testcontainers.org/modules/databases/r2dbc/)
* [Testcontainers DB2 Module Reference Guide](https://www.testcontainers.org/modules/databases/db2/)
* [Testcontainers Kafka Modules Reference Guide](https://www.testcontainers.org/modules/kafka/)
* [Testcontainers MariaDB Module Reference Guide](https://www.testcontainers.org/modules/databases/mariadb/)
* [Testcontainers MySQL Module Reference Guide](https://www.testcontainers.org/modules/databases/mysql/)
* [Testcontainers Postgres Module Reference Guide](https://www.testcontainers.org/modules/databases/postgres/)
* [Testcontainers Oracle-XE Module Reference Guide](https://www.testcontainers.org/modules/databases/oraclexe/)
* [Testcontainers MS SQL Server Module Reference Guide](https://www.testcontainers.org/modules/databases/mssqlserver/)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-spring-hateoas)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-webservices)
* [Jersey](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-jersey)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Mustache](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Groovy Templates](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-security)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-security-oauth2-client)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-security-oauth2-server)
* [Spring LDAP](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-ldap)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-sql)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/spring-boot-features.html#boot-features-r2dbc)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#howto-execute-liquibase-database-migrations-on-startup)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-jooq)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-redis)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-redis)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-mongodb)
* [Spring Data Reactive MongoDB](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-mongodb)
* [Spring Data Elasticsearch (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-elasticsearch)
* [Spring Data for Apache Cassandra](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-cassandra)
* [Spring Data Reactive for Apache Cassandra](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-cassandra)
* [Spring for Apache Geode](https://docs.spring.io/spring-boot-data-geode-build/current/reference/html5/)
* [Spring Data Couchbase](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-couchbase)
* [Spring Data Reactive Couchbase](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-couchbase)
* [Spring Data Neo4j](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-neo4j)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-integration)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-amqp)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-kafka)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/_reference.html#kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/#_kafka_streams_binding_capabilities_of_spring_cloud_stream)
* [Spring for Apache ActiveMQ 5](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-activemq)
* [Spring for Apache ActiveMQ Artemis](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-artemis)
* [WebSocket](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-websockets)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#howto-batch-applications)
* [Validation](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-validation)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-email)
* [Spring cache abstraction](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-caching)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#production-ready)
* [Datadog](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/production-ready-features.html#production-ready-metrics-export-datadog)
* [Influx](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/production-ready-features.html#production-ready-metrics-export-influx)
* [Graphite](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/production-ready-features.html#production-ready-metrics-export-graphite)
* [New Relic](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/production-ready-features.html#production-ready-metrics-export-new-relic)
* [Prometheus](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/production-ready-features.html#production-ready-metrics-export-prometheus)
* [Wavefront for Spring Boot documentation](https://docs.wavefront.com/wavefront_springboot.html)
* [Wavefront for Spring Boot repository](https://github.com/wavefrontHQ/wavefront-spring-boot)
* [Testcontainers](https://www.testcontainers.org/)
* [Embedded LDAP Server](https://docs.spring.io/spring-boot/docs/2.6.0/reference/html/boot-features-nosql.html#boot-features-ldap-embedded)
* [Cloud Bootstrap](https://spring.io/projects/spring-cloud-commons)
* [Function](https://cloud.spring.io/spring-cloud-function/)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Apache Zookeeper Quick Start](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#distributed-configuration-usage)
* [Spring Cloud Consul Quick Start](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#distributed-configuration-usage)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer)
* [Resilience4J](https://cloud.spring.io/spring-cloud-static/spring-cloud-circuitbreaker/current/reference/html)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Using Spring for Apache Geode](https://github.com/spring-projects/spring-boot-data-geode/tree/master/spring-geode-samples)
* [Accessing Data with Neo4j](https://spring.io/guides/gs/accessing-data-neo4j/)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)
* [Java Message Service API via Apache ActiveMQ Classic.](https://spring.io/guides/gs/messaging-jms/)
* [Messaging with JMS](https://spring.io/guides/gs/messaging-jms/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Spring Cloud Contract Verifier Setup](https://cloud.spring.io/spring-cloud-contract/spring-cloud-contract.html#_spring_cloud_contract_verifier_setup)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)

### Additional Links
These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.11.0-RC1/reference/htmlsingle/#spring-aot-maven)
* [R2DBC Homepage](https://r2dbc.io)
* [Switch from Apache Geode to Pivotal Cloud Cache](https://docs.spring.io/spring-boot-data-geode-build/current/reference/html5/#geode-gemfire-switch)
* [Various sample apps using Spring Cloud Function](https://github.com/spring-cloud/spring-cloud-function/tree/master/spring-cloud-function-samples)
* [Declarative REST calls with Spring Cloud OpenFeign sample](https://github.com/spring-cloud-samples/feign-eureka)

## Observability with Wavefront

If you don't have a Wavefront account, the starter will create a freemium account for you.
The URL to access the Wavefront Service dashboard is logged on startup.

You can also access your dashboard using the `/actuator/wavefront` endpoint.
## Spring Native

This project has been configured to let you generate either a lightweight container or a native executable.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started with Spring Native.
Docker should be installed and configured on your machine prior to creating the image, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.11.0-RC1/reference/htmlsingle/#getting-started-buildpacks).

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 sandbox:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.11.0-RC1/reference/htmlsingle/#getting-started-native-build-tools).

To create the executable, run the following goal:

```
$ ./mvnw package -Pnative
```

Then, you can run the app as follows:
```
$ target/sandbox
```
