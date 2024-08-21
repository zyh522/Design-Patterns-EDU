package com.zyh.design.structural.proxy;

/**
 * @author zhuyh
 * @version v1.0
 * @description 代售点
 * @date 2024/8/21
 **/
public class ProxyOutlet implements Ticket{

    private TrainStation trainStation;

    @Override
    public void sale() {
        if (trainStation == null){
            trainStation = new TrainStation();
        }
        // 目标方法前增强功能
        trainStation.sale();
        // 目标方法后增强功能
    }
}
