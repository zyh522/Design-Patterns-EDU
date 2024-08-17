package com.zyh.design.creational.singleton.example;

import com.zyh.design.creational.singleton.Singleton1;

import java.lang.reflect.Constructor;

/**
 * @author zhuyh
 * @version v1.0
 * @description 通过反射机制破坏单例
 *      如何解决？
 *      {@link Singleton1}
 * @date 2024/8/17
 **/
public class BreakSingleton{

    public static void main(String[] args) throws Exception{

        Class<?> clazz = Class.forName("com.zyh.design.creational.singleton.Singleton1");
        Constructor<?> c = clazz.getDeclaredConstructor();
        c.setAccessible(true);

        Singleton1 instance1 = (Singleton1)c.newInstance();
        Singleton1 instance2 = (Singleton1)c.newInstance();
        //通过反射，得到的两个对象不同
        System.out.println(instance1);
        System.out.println(instance2);
    }
}