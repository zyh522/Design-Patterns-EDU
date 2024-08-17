package com.zyh.design.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 *      第二种方式
 *           懒汉式-线程安全：使用时创建实例。
 *           缺点：多线程环境下依靠synchronized关键字保证线程安全，效率低
 * @date 2024/8/17
 **/
public class Singleton2 implements Serializable {


    private Singleton2(){}

    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance() {
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    /**
     * 反序列化定义该方法，则不需要创建新对象
     */
//    private Object readResolve() throws ObjectStreamException {
//        return instance;
//    }
}
