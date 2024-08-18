package com.zyh.design.structural.bridge;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/17
 **/
public class Brush1 extends Pen {


    public Brush1(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("我是画笔1");
        color.draw();
    }
}
