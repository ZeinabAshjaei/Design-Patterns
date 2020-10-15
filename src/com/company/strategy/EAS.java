package com.company.strategy;

public class EAS implements Encryption {
    @Override
    public String encrypt(String Text) {
        System.out.println("Encrypting message using AES");
        return "encryptedText";
    }
}
