package com.pb.singleton;

/**
 * 饿汉模式
 */
public class HungrySingletonDemo {
    private static final HungrySingletonDemo instance = new HungrySingletonDemo();

    private HungrySingletonDemo() {
    }
    public HungrySingletonDemo getInstance(){
        return instance;
    }
}
