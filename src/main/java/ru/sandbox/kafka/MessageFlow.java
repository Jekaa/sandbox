package ru.sandbox.kafka;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.handler.advice.ErrorMessageSendingRecoverer;
import org.springframework.integration.kafka.dsl.Kafka;
import org.springframework.integration.kafka.support.RawRecordHeaderErrorMessageStrategy;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import ru.sandbox.model.SandboxMessage;

import static org.springframework.messaging.MessageHeaders.ERROR_CHANNEL;

public class MessageFlow {

    static final String CONSUMER_FACTORY = "consumerFactory";

    @Bean
    public IntegrationFlow topic1ListenerFromKafkaFlow(@Qualifier(ERROR_CHANNEL) MessageChannel errorChannel, KafkaProperties kafkaProperties,
                                                       @Qualifier(CONSUMER_FACTORY) ConsumerFactory<String, SandboxMessage> consumerFactory,
                                                       MessageHandler handler) {
        return IntegrationFlows
                .from(Kafka.messageDrivenChannelAdapter(consumerFactory,
                        kafkaProperties.getInTopic())
                        .configureListenerContainer(c -> c.id("RequestListenerContainer")
                                .ackMode(ContainerProperties.AckMode.TIME)
                                .ackTime(kafkaProperties.getAutocommitIntervalMs())
                                .concurrency(kafkaProperties.getListenerConcurrency()))
                        .recoveryCallback(new ErrorMessageSendingRecoverer(errorChannel,
                                new RawRecordHeaderErrorMessageStrategy())))
                .handle(handler)
                .get();
    }
}
