package com;

import com.factory.ConsoleLoggerFactory;
import com.factory.FileLoggerFactory;
import com.factory.LoggerFactory;
import com.log.Logger;

public class App {

    public static void main(String[] args) {
        // 使用FileLoggerFactory创建FileLogger
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.logMessage("This is a message logged to file.");

        // 使用ConsoleLoggerFactory创建ConsoleLogger
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.logMessage("This a message logged to console.");
    }
}
