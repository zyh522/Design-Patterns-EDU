package com.zyh.design.creational.factory.factory;

import com.zyh.design.creational.factory.model.Phone;
import com.zyh.design.creational.factory.model.Huawei;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/16
 **/
public class HuaweiFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new Huawei();
    }
}
