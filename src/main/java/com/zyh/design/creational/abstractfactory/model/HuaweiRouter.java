package com.zyh.design.creational.abstractfactory.model;

/**
 * @author zhuyh
 * @version v1.0
 * @description 具体产品
 * @date 2024/8/17
 **/
public class HuaweiRouter implements Router{
    @Override
    public void connect() {
        System.out.println("huawei router connect");
    }
}
