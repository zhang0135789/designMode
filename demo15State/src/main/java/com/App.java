package com;


import com.state.impl.StatePowerOff;
import com.state.impl.StatePowerOn;

/**
 * Hello world!
 * 类的行为是基于它的状态改变的。
 */
public class App {

    public static void main( String[] args ) {
        // 初始状态关机
        Context context = new Context(new StatePowerOff());
        context.changeChannel(); // 调频道
        context.changeSound(); // 调声音

        // 切换到开机状态
        context.setState(new StatePowerOn());
        context.changeSound();
        context.changeChannel();
    }

}
