package com.company.strategy;

public class Des implements Encryption {
    @Override
    public String encrypt(String Text) {
        System.out.println("Encrypting message using DES");
        return "encryptedText";
    }
}
