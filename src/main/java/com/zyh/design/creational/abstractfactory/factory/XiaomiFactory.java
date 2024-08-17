package com.zyh.design.creational.abstractfactory.factory;

import com.zyh.design.creational.abstractfactory.model.Phone;
import com.zyh.design.creational.abstractfactory.model.Router;
import com.zyh.design.creational.abstractfactory.model.XiaomiPhone;
import com.zyh.design.creational.abstractfactory.model.XiaomiRouter;

/**
 * @author zhuyh
 * @version v1.0
 * @description 具体工厂
 * @date 2024/8/17
 **/
public class XiaomiFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Router getRouter() {
        return new XiaomiRouter();
    }
}
