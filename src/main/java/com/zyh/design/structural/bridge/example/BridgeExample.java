package com.zyh.design.structural.bridge.example;

import com.zyh.design.structural.bridge.*;

/**
 * @author zhuyh
 * @version v1.0
 * @description 桥接模式：用于将抽象部分与实现部分分离，使得它们可以独立地变化
 *          案例1：例如有2只粗细不同的画笔，有3种不同的颜色，那么它们可以画出 2*3 种不同粗细不同颜色的线条，
 *          如果只有画笔想要画出这些线条，就需要6种画笔。
 *          前面的画笔就是一种桥接模式，画笔的粗细和颜色是两个不同的变化维度，将它们拆分开(解耦合)后组合(聚合)在一起更方便
 *
 * @date 2024/8/17
 **/
public class BridgeExample {

    public static void main(String[] args) {

        Pen brush1 = new Brush1(new Blue());
        brush1.draw();

        Pen brush2 = new Brush2(new Red());
        brush2.draw();
    }
}
