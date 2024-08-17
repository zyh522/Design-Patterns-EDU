package com.zyh.design.creational.singleton;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 *      第三种方式：
 *          饿汉式：类加载时就初始化实例，利用类加载机制保证了多线程环境下的安全
 *          缺点：类加载时实例化对象，浪费内存
 * @date 2024/8/17
 **/
public class Singleton3 {

    private Singleton3(){}

    private static final Singleton3 instance = new Singleton3();

    public static Singleton3 getInstance(){
        return instance;
    }

}
