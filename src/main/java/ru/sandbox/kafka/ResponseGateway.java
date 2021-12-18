package ru.sandbox.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import ru.sandbox.model.SandboxMessage;

@Component
@RequiredArgsConstructor
public class ResponseGateway {

    private final OutGateway outGateway;

    void send(MessageHeaders headers, SandboxMessage in) {
        outGateway.sendResponse(headers, in);
    }
}
