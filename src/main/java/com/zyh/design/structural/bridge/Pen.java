package com.zyh.design.structural.bridge;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/17
 **/
public abstract class Pen {

    protected Color color;

    public Pen(Color color) {
        this.color = color;
    }

    public abstract void draw();

}