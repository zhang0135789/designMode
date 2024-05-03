package com.factory;

import com.log.ConsoleLogger;
import com.log.Logger;

public class ConsoleLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
