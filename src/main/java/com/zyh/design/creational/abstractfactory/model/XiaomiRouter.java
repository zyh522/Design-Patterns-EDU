package com.zyh.design.creational.abstractfactory.model;

/**
 * @author zhuyh
 * @version v1.0
 * @description 具体产品
 * @date 2024/8/17
 **/
public class XiaomiRouter implements Router{

    @Override
    public void connect() {
        System.out.println("xiaomi router connect");
    }
}