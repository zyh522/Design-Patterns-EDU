package com.zyh.design.creational.singleton;

/**
 * @author zhuyh
 * @version v1.0
 * @description 单例模式
 *      第一种方式
 *          懒汉式-线程不安全：使用时创建实例。
 *          缺点：多线程环境下无法保证单例
 * @date 2024/8/17
 **/
public class Singleton1 {

    private Singleton1(){
        // 防止通过反射破坏单例
//        if (instance != null){
//            throw new RuntimeException();
//        }
    }

    private static Singleton1 instance;

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
