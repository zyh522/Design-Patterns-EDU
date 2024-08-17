package com.zyh.design.creational.abstractfactory.example;

import com.zyh.design.creational.abstractfactory.factory.Factory;
import com.zyh.design.creational.abstractfactory.factory.HuaweiFactory;
import com.zyh.design.creational.abstractfactory.factory.XiaomiFactory;

/**
 * @author zhuyh
 * @version v1.0
 * @description 抽象工厂模式
 *  产品等级：多个品牌下的同一类型的产品为一个产品等级，如华为手机、小米手机为一个产品等级
 *  产品簇：同一品牌下的不同类型产品为一个产品簇，如华为手机、华为路由器
 *  抽象工厂模式结构：
 *      抽象工厂：声明了一组用于创建产品实例的方法，每个方法对应一个产品类型。抽象工厂可以是接口或抽象类。
 *          {@link Factory}
 *      具体工厂：实现抽象工厂，创建具体产品实例
 *          {@link HuaweiFactory}
 *          {@link XiaomiFactory}
 *      抽象产品：定义了同一类产品的公共方法/属性。可以是接口或抽象类
 *          {@link com.zyh.design.creational.abstractfactory.model.Router}
 *      具体产品：实现了抽象产品接口，定义了具体产品的特定行为和属性
 *          {@link com.zyh.design.creational.abstractfactory.model.HuaweiRouter}
 *  缺点：产品族中扩展新产品困难(难以支持新种类的产品)，例如新增笔记本电脑这种产品(huawei笔记本、xiaomi笔记本)
 *  需修改Factory、HuaweiFactory、XiaomiFactory，新增获取笔记本电脑的方法，违反了开闭原则
 *  优点：新增新品牌，只需要添加相应的工厂类实现Factory，符合开闭原则，将一个系列的产品统一到一起创建。
 * @date 2024/8/17
 **/
public class AbstractFactoryExample {

    public static void main(String[] args) {
        Factory huaweiFactory = new HuaweiFactory();
        huaweiFactory.getPhone().call();
        huaweiFactory.getRouter().connect();

        Factory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.getPhone().call();
        xiaomiFactory.getRouter().connect();
    }
}
