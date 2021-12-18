package ru.sandbox.kafka.producer;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Data
@Primary
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "kafka")
@Validated
public class KafkaProducerProperties {
}
