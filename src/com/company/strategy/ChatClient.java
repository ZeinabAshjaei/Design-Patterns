package com.company.strategy;

public class ChatClient {
    private final Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
         encryptionAlgorithm.encrypt(message);

        System.out.println("Sending the encrypted message...");
    }
}
