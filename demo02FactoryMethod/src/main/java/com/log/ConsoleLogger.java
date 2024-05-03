package com.log;

public class ConsoleLogger implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println("Console Logger: " + message);
    }
}
