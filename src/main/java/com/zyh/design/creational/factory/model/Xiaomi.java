package com.zyh.design.creational.factory.model;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/16
 **/
public class Xiaomi implements Phone {

    @Override
    public void call() {
        System.out.println("xiaomi call");
    }
}
