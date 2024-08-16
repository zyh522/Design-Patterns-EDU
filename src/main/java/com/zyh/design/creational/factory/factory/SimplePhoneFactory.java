package com.zyh.design.creational.factory.factory;

import com.zyh.design.creational.factory.Phone;
import com.zyh.design.creational.factory.model.Huawei;
import com.zyh.design.creational.factory.model.IPhone;
import com.zyh.design.creational.factory.model.Xiaomi;

/**
 * @author zhuyh
 * @version v1.0
 * @description 简单手机工厂，用于生产手机
 * @date 2024/8/16
 **/
public class SimplePhoneFactory {


    /**
     * 根据传入的手机类型生产手机
     * @param phoneType 手机类型
     * @return Phone  手机实例
     */
    public static Phone getPhone(String phoneType){
        if (phoneType == null)
            return null;
        if ("xiaomi".equalsIgnoreCase(phoneType))
            return new Xiaomi();
        else if ("iphone".equalsIgnoreCase(phoneType)) {
            return new IPhone();
        } else if ("huawei".equalsIgnoreCase(phoneType)) {
            return new Huawei();
        }
        return null;
    }
}
