package ru.sandbox.kafka.consumer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Primary
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "kafka")
@Validated
public class KafkaConsumerProperties {
    @Getter
    @Setter
    @NotNull
    private List<String> bootstrapServers;
    @Getter
    @Setter
    @NotNull
    private String inTopic;
    @Getter
    @Setter
    @NotNull
    private String outTopic;
    @Getter
    @Setter
    @NotBlank
    private String groupId;
    @Getter
    @Setter
    @Min(10)
    @Max(1000)
    private int maxPollRecords;
    @Getter
    @Setter
    private boolean autocommitEnabled;
    @Getter
    @Setter
    @Min(300)
    @Max(5000)
    private int autocommitIntervalMs;
    @Getter
    @Setter
    @Min(5)
    @Max(60)
    private int consumerSessionTimeoutSec;
    @Getter
    @Setter
    @Min(1)
    @Max(20)
    private int listenerConcurrency;
    @Getter
    @Setter
    @Min(0)
    @Max(200)
    private int producerLingerMs;
    @Getter
    @Setter
    @Min(1000)
    @Max(60000)
    private int producerMaxBlockMs;
    @Getter
    @Setter
    private boolean sslEnabled;
    @Getter
    @Setter
    private String trustStoreLocation;
    @Getter
    @Setter
    private String trustStorePassword;
    @Getter
    @Setter
    private String keyStoreLocation;
    @Getter
    @Setter
    private String keyStorePassword;
    @Getter
    @Setter
    private String securityProtocol;
}
