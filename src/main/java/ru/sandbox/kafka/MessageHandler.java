package ru.sandbox.kafka;

import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import ru.sandbox.model.SandboxMessage;

@Component
class MessageHandler {

    private final ResponseGateway out;

    MessageHandler(ResponseGateway out) {
        this.out = out;
    }

    //todo processing
    void handle(MessageHeaders headers, SandboxMessage message) {
        out.send(headers, message);
    }
}

