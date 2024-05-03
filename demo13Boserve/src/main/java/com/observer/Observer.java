package com.observer;


import com.Subject;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:20
 */
// 观察者抽象类
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
