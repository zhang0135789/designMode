package com.command.impl;


import com.command.Command;
import com.domin.TV;

/**
 * @author: xupengboo
 * @date: 2024/2/28 15:10
 * @description: 关闭命令
 */
// 具体命令
public class TurnOnCommand implements Command {

    private TV tv;

    public TurnOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }

}
