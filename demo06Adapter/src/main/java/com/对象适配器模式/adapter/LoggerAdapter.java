package com.对象适配器模式.adapter;


/**
 * @author: xupengboo
 * @date: 2024/1/26 10:45
 * @description: 适配器类
 */

import com.对象适配器模式.newLogger.ConsoleLogger;
import com.对象适配器模式.newLogger.FileLogger;
import com.对象适配器模式.newLogger.NewLogger;
import com.对象适配器模式.oldLogger.Logger;

/**
 * 适配器类：通过组合被适配者对象来实现。
 */
public class LoggerAdapter implements Logger {

    NewLogger newLogger;

    /**
     * 构造器
     */
    public LoggerAdapter(String logType) {
        if (logType.equalsIgnoreCase("CONSOLE")) {
            newLogger = new ConsoleLogger();
        } else if (logType.equalsIgnoreCase("FILE")) {
            newLogger = new FileLogger();
        }
    }

    public void log(String message, String logType) {
        if (logType.equalsIgnoreCase("CONSOLE")) {
            newLogger.logError(message);
            newLogger.logMessage(message);
        } else if (logType.equalsIgnoreCase("FILE")) {
            newLogger.logError(message);
            newLogger.logMessage(message);
        }
    }

}
