package com;


import com.command.Command;
import com.command.impl.TurnOffCommand;
import com.command.impl.TurnOnCommand;
import com.domin.TV;
import com.remote.RemoteControl;

/**
 * Hello world!
 * 将一个命令对象化，包含execute 方法，通过一个命令对象进行通信。例如：电视遥控器
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 电视机
        TV tv = new TV();

        // 创建指令
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        // 遥控器
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }

}
