package com.log;

public class FileLogger implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println("File Logger: " + message);
    }
}
