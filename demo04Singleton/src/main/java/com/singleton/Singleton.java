package com.singleton;

public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    // 全局访问点，用于获取单例实例
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
