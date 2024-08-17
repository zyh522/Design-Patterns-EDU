package com.zyh.design.structural.adapter;

/**
 * @author zhuyh
 * @version v1.0
 * @description 对象适配器：实现目标接口，现有接口的实现作为属性
 * @date 2024/8/17
 **/
public class Adapter2 implements Target{

    private final Currently currently;

    public Adapter2(Currently currently){
        this.currently = currently;
    }

    @Override
    public void chargeBy110V() {
        // 现有接口功能
        currently.chargeBy220V();
        // 扩展现有功能
        System.out.println("适配器降低电压，满足需求:110V充电");
    }
}
