package ru.sandbox.kafka;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import ru.sandbox.model.SandboxMessage;

@MessagingGateway
public interface OutGateway {

    @Gateway(requestChannel = "OutChannel")
    void sendResponse(@Headers MessageHeaders headers, SandboxMessage message);
}