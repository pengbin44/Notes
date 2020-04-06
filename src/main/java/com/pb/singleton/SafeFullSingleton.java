package com.pb.singleton;

/**
 * 安全的饱汉模式
 */
public class SafeFullSingleton {

    /**
     * 可以做饱汉模式
     *
     * 内部类，只要没有被使用，就不会初始化，Singleton的实例就不会创建
     *
     * 在第一次有人调用getInstance方法的时候，内部类会初始化，创建一个Singleton的实例
     *
     * 然后java能确保的一点是，类静态初始化的过程一定只会执行一次
     *
     * @author zhonghuashishan
     *
     */
    public static class Singleton {

        private Singleton() {
        }
        public static class InnerSingleton{
            public static final Singleton instance = new Singleton();
        }
        public Singleton getInstance(){
            return InnerSingleton.instance;
        }

    }
}
