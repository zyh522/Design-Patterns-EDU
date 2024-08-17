package com.zyh.design.structural.adapter;

/**
 * @author zhuyh
 * @version v1.0
 * @description 类适配器，继承现有接口的实现CurrentlyImpl，实现目标接口Target
 * @date 2024/8/17
 **/
public class Adapter1 extends CurrentlyImpl implements Target{


    @Override
    public void chargeBy110V() {
        // 现有接口提供220V充电
        super.chargeBy220V();
        // 对现有功能扩展
        System.out.println("适配器降低电压，满足需求:110V充电");
    }
}
