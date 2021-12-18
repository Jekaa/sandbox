package ru.sandbox.kafka;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.integration.kafka.dsl.Kafka;
import org.springframework.integration.kafka.dsl.KafkaProducerMessageHandlerSpec;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.DefaultKafkaHeaderMapper;
import ru.sandbox.model.SandboxMessage;

@EnableKafka
@Configuration
@Slf4j
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaProducerConfig {

    private final KafkaProperties kafkaProperties;

    @Autowired
    public KafkaProducerConfig(KafkaProperties kafkaProperties) {
        this.kafkaProperties = kafkaProperties;
    }

    @Bean
    public KafkaProducerMessageHandlerSpec<String, SandboxMessage, ?> responseKafkaHandler() {
        ProducerFactory<String, SandboxMessage> producerFactory =
                new DefaultKafkaProducerFactory<>(ImmutableMap.<String, Object>builder()
                        .put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers())
                        .put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class)
                        .put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaMessageSerializer.class)
                        .put(ProducerConfig.LINGER_MS_CONFIG, kafkaProperties.getProducerLingerMs())
                        .put(ProducerConfig.MAX_BLOCK_MS_CONFIG, kafkaProperties.getProducerMaxBlockMs()).build());
        return Kafka.outboundChannelAdapter(producerFactory)
                .<SandboxMessage>messageKey(m -> m
                        .getHeaders()
                        .get(IntegrationMessageHeaderAccessor.SEQUENCE_NUMBER))
                .headerMapper(mapper())
                .<SandboxMessage>topic(m -> kafkaProperties.getOutTopic())
                .configureKafkaTemplate(t -> t.id("template: " + kafkaProperties.getOutTopic()));
    }

    @Bean
    public DefaultKafkaHeaderMapper mapper() {
        return new DefaultKafkaHeaderMapper();
    }
}
