package com.command.impl;


import com.command.Command;
import com.domin.TV;

/**
 * @author: xupengboo
 * @date: 2024/2/28 15:13
 * @description: 打开命令
 */
// 具体命令
public class TurnOffCommand implements Command {

    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }

}
