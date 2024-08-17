package com.zyh.design.creational.factory.example;

import com.zyh.design.creational.factory.model.Phone;
import com.zyh.design.creational.factory.factory.SimplePhoneFactory;

/**
 * @author zhuyh
 * @version v1.0
 * @description 简单工厂模式使用案例
 *  只需传入需要的手机类型，工厂即可生产手机，使用者无需关心手机是如何生产的
 *  但是，增加一个手机类型就需要修改工厂类SimplePhoneFactory来支持新增的类型，违反了开闭原则
 *  如何解决？
 *  {@link FactoryMethodPatternExample}
 *
 * @date 2024/8/16
 **/
public class SimpleFactoryPatternExample {

    public static void main(String[] args) {
        // 只需传入需要的手机类型，工厂即可生产手机，使用者无需关心手机是如何生产的
        Phone xiaomi = SimplePhoneFactory.getPhone("xiaomi");
        xiaomi.call();
        Phone huawei = SimplePhoneFactory.getPhone("huawei");
        huawei.call();
        Phone iphone = SimplePhoneFactory.getPhone("iphone");
        iphone.call();
    }
}
