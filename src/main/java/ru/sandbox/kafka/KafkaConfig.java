package ru.sandbox.kafka;

import com.google.common.collect.ImmutableMap;
import io.vavr.collection.HashMap;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.RoundRobinAssignor;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import ru.sandbox.model.SandboxMessage;
import ru.sandbox.model.SandboxMessageDeserializer;

import java.util.Collections;
import java.util.Map;

import static org.apache.kafka.clients.CommonClientConfigs.SECURITY_PROTOCOL_CONFIG;
import static org.apache.kafka.common.config.SslConfigs.*;

@EnableKafka
@Configuration
@Slf4j
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaConfig {

    static final String CONSUMER_FACTORY = "consumerFactory";
    static final String RESPONSE_KAFKA_HANDLER = "responseKafkaHandler";
    static final String RESPONSE_KAFKA_HANDLER_4_FIRST_SESSION = "responseKafkaHandler4Session";

    private final KafkaProperties kafkaProperties;

    @Autowired
    public KafkaConfig(KafkaProperties kafkaProperties) {
        this.kafkaProperties = kafkaProperties;
    }

    public Map<String, Object> defaultConsumerProps() {
        return ImmutableMap.<String, Object>builder()
                .putAll(kafkaProperties.isSslEnabled() ? getSslProperties() : Collections.emptyMap())
                .put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers())
                .put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class)
                .put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, SandboxMessageDeserializer.class)
                .put(ConsumerConfig.PARTITION_ASSIGNMENT_STRATEGY_CONFIG, RoundRobinAssignor.class.getName())
                .put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, kafkaProperties.getMaxPollRecords())
                .put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, kafkaProperties.isAutocommitEnabled())
                .put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, kafkaProperties.getAutocommitIntervalMs())
                .put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 1000 * kafkaProperties.getConsumerSessionTimeoutSec())
                .build();
    }

    @Bean(CONSUMER_FACTORY)
    public ConsumerFactory<String, SandboxMessage> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(
                ImmutableMap.<String, Object>builder()
                        .putAll(defaultConsumerProps())
                        .put(ConsumerConfig.GROUP_ID_CONFIG, kafkaProperties.getGroupId())
                        .build());
    }

    private Map<String, Object> getSslProperties() {
        return HashMap.<String, Object>of(
                SSL_TRUSTSTORE_LOCATION_CONFIG, kafkaProperties.getTrustStoreLocation(),
                SSL_TRUSTSTORE_PASSWORD_CONFIG, kafkaProperties.getTrustStorePassword(),
                SSL_KEYSTORE_LOCATION_CONFIG, kafkaProperties.getKeyStoreLocation(),
                SSL_KEYSTORE_PASSWORD_CONFIG, kafkaProperties.getKeyStorePassword(),
                SECURITY_PROTOCOL_CONFIG, kafkaProperties.getSecurityProtocol(),
                SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_CONFIG, "")
                .toJavaMap();
    }
}
