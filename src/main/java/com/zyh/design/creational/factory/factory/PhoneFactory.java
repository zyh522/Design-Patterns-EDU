package com.zyh.design.creational.factory.factory;

import com.zyh.design.creational.factory.model.Phone;

/**
 * @author zhuyh
 * @version v1.0
 * @description 手机工厂，所有手机需实现该接口
 * @date 2024/8/16
 **/
public interface PhoneFactory {

    Phone getPhone();
}