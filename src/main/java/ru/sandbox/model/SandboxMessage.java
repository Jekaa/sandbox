package ru.sandbox.model;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.UUID;

public class SandboxMessage implements Message<Map<String, Object>> {

    @NotNull
    private UUID uuid;
    @NotNull
    private MessageHeaders messageHeaders;
    @NotNull
    private Map<String, Object> payload;

    @Override
    public Map<String, Object> getPayload() {
        return payload;
    }

    @Override
    public MessageHeaders getHeaders() {
        return messageHeaders;
    }
}
