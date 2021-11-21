package ru.sandbox.model;

public class SandboxMessageDeserializer extends LaxMessageDeserializer<SandboxMessage> {
    public SandboxMessageDeserializer() {
        super(SandboxMessage.class);
    }
}