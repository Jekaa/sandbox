package ru.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import ru.sandbox.kafka.KafkaConsumerConfig;
import ru.sandbox.kafka.KafkaProperties;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableConfigurationProperties({KafkaProperties.class})
@Import({KafkaConsumerConfig.class})
public class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
	}

}
