package com.zyh.design.structural.adapter;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/17
 **/
public class CurrentlyImpl implements Currently{
    @Override
    public void chargeBy220V() {
        System.out.println("现有提供220v 充电");
    }
}
