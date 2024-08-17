package com.zyh.design.creational.abstractfactory.factory;

import com.zyh.design.creational.abstractfactory.model.Phone;
import com.zyh.design.creational.abstractfactory.model.Router;

/**
 * @author zhuyh
 * @version v1.0
 * @description 抽象工厂
 * @date 2024/8/17
 **/
public interface Factory {

    Phone getPhone();
    Router getRouter();
}