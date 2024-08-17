package com.zyh.design.creational.factory.factory;

import com.zyh.design.creational.factory.model.Phone;
import com.zyh.design.creational.factory.model.IPhone;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/16
 **/
public class IPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new IPhone();
    }
}
