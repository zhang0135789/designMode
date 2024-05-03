package com;


import com.cup.abs.CupWithHolder;
import com.cup.abs.CupWithoutHolder;

/**
 * Hello world!
 * 定义一个操作中的算法的骨架。
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        CupWithHolder cupWithHolder = new CupWithHolder();
        cupWithHolder.makeCup(); // 制造带把手的杯子

        CupWithoutHolder cupWithoutHolder = new CupWithoutHolder();
        cupWithHolder.makeCup(); // 制造不带把手的杯子
    }

}
