package com.zyh.design.creational.singleton;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 *      懒汉式-双重校验机制：instance使用 volatile关键字修饰，使其他线程可见
 *      第一次判断若instance没有实例化，进入获取锁状态
 *      获取到锁的线程第二次判断若instance没有实例化，则该线程进行实例化，释放锁
 *      优点：保证了线程安全的同时，使用了双重校验机制，提高了效率
 *
 * @date 2024/8/17
 **/
public class Singleton4 {

    private Singleton4(){}

    private volatile static Singleton4 instance;

    public static Singleton4 getInstance() {
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
