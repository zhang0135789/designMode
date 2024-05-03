package com.factory;

import com.log.FileLogger;
import com.log.Logger;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
