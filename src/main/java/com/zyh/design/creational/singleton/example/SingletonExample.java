package com.zyh.design.creational.singleton.example;

import com.zyh.design.creational.singleton.Singleton1;
import com.zyh.design.creational.singleton.Singleton2;
import com.zyh.design.creational.singleton.Singleton3;
import com.zyh.design.creational.singleton.Singleton4;

/**
 * @author zhuyh
 * @version v1.0
 * @description 单例模式示例
 *
 *  意图：确保一个类只有一个实例，并提供一个全局访问点来访问该实例
 *  除开枚举单例之外，其他单例模式都可以通过反射机制{@link BreakSingleton} 和序列化机制{@link BreakSingleton2}来破坏单例，
 * @date 2024/8/17
 **/
public class SingletonExample {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                // 多线程不可使用
//                Singleton1 instance = Singleton1.getInstance();
//                System.out.println(instance);
//            }).start();
//        }


//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                // 多线程可用
//                Singleton2 instance = Singleton2.getInstance();
//                System.out.println(instance);
//            }).start();
//        }


//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                // 多线程可用
//                Singleton3 instance = Singleton3.getInstance();
//                System.out.println(instance);
//            }).start();
//        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                // 多线程可用
                Singleton4 instance = Singleton4.getInstance();
                System.out.println(instance);
            }).start();
        }

    }


}
