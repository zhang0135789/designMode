package com;


import com.facade.ComputerFacade;

/**
 * Hello world!
 * 以 计算机为例，外观上就是电脑，但里面的子系统有 CPU、Memory、HardDriver等，
 * 启动的时候先启动哪个再启动哪个，用户无需关心。缺点也很明显：不符合开闭原则！如果要改东西很麻烦。
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 以计算机为例：下面有CPU、内存、硬盘驱动器等子系统
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }

}
