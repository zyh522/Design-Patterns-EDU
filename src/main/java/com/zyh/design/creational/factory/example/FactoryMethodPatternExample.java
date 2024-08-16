package com.zyh.design.creational.factory.example;

import com.zyh.design.creational.factory.Phone;
import com.zyh.design.creational.factory.factory.HuaweiFactory;
import com.zyh.design.creational.factory.factory.IPhoneFactory;
import com.zyh.design.creational.factory.factory.XiaomiFactory;

/**
 * @author zhuyh
 * @version v1.0
 * @description 工厂方法模式使用案例
 *  工厂方法模式将对象的创建交给对应产品的工厂，解决了新增一个产品就需要修改原来工厂的问题
 *  但是同样带来了新问题：每新增一个产品除了产品类还需要新增一个工厂类，产品种类越多，增加的类就越多
 *  使项目变得复杂、难以维护，容易出现类爆炸
 *  当然，没有十全十美的设计模式，应当根据项目来决定使用哪种设计模式
 * @date 2024/8/16
 **/
public class FactoryMethodPatternExample {

    public static void main(String[] args) {
        // 需要什么产品就从什么工厂获取
        Phone xiaomi = new XiaomiFactory().getPhone();
        xiaomi.call();

        Phone huawei = new HuaweiFactory().getPhone();
        huawei.call();

        Phone iPhone = new IPhoneFactory().getPhone();
        iPhone.call();
    }
}
