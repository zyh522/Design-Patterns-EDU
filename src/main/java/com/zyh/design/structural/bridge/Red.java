package com.zyh.design.structural.bridge;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/17
 **/
public class Red implements Color{
    @Override
    public void draw() {
        System.out.println("画出红色");
    }
}