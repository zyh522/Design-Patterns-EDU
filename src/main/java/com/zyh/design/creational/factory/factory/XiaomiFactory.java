package com.zyh.design.creational.factory.factory;

import com.zyh.design.creational.factory.Phone;
import com.zyh.design.creational.factory.model.Xiaomi;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/16
 **/
public class XiaomiFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new Xiaomi();
    }
}
