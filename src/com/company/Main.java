package com.company;

import com.company.strategy.ChatClient;
import com.company.strategy.Des;

public class Main {

    public static void main(String[] args) {

        ChatClient client = new ChatClient(new Des());
        client.send("Hello World");
    }
}
