package com;


import com.observer.abs.BinaryObserver;
import com.observer.abs.HexaObserver;
import com.observer.abs.OctalObserver;

/**
 * Hello world!
 * 当一个对象的状态发生改变时，其所有依赖者都会收到通知并自动更新。
 */
public class App {

    public static void main( String[] args ) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
