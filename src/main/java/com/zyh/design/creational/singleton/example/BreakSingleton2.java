package com.zyh.design.creational.singleton.example;

import com.zyh.design.creational.singleton.Singleton2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author zhuyh
 * @version v1.0
 * @description 通过序列化机制破坏单例
 *      如何解决？
 *      {@link Singleton2}
 * @date 2024/8/17
 **/
public class BreakSingleton2 {

    public static void main(String[] args) {

        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();

        //将instance写入本地某个路径
        try (FileOutputStream fos = new FileOutputStream("E://test.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("E://test.txt")))) {

            oos.writeObject(instance);

            //从本地某个路径读取写入的对象
            Singleton2 instance2 = (Singleton2) ois.readObject();
            System.out.println(instance);
            System.out.println(instance1);
            System.out.println(instance2); //instance2是一个新对象
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
