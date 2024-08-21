package com.zyh.design.structural.proxy;

/**
 * @author zhuyh
 * @version v1.0
 * @description 火车站
 * @date 2024/8/21
 **/
public class TrainStation implements Ticket{


    @Override
    public void sale() {
        System.out.println("售出一张票");
    }
}
