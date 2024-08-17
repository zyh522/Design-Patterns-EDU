package com.zyh.design.creational.abstractfactory.factory;

import com.zyh.design.creational.abstractfactory.model.HuaweiPhone;
import com.zyh.design.creational.abstractfactory.model.HuaweiRouter;
import com.zyh.design.creational.abstractfactory.model.Phone;
import com.zyh.design.creational.abstractfactory.model.Router;

/**
 * @author zhuyh
 * @version v1.0
 * @description 具体工厂
 * @date 2024/8/17
 **/
public class HuaweiFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Router getRouter() {
        return new HuaweiRouter();
    }
}
