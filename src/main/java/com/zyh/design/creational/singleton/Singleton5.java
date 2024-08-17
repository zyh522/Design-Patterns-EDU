package com.zyh.design.creational.singleton;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/17
 **/
public class Singleton5 {

    private Singleton5(){}

    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
    
    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }
}
