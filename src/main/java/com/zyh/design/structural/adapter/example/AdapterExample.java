package com.zyh.design.structural.adapter.example;

import com.zyh.design.structural.adapter.Adapter1;
import com.zyh.design.structural.adapter.Adapter2;
import com.zyh.design.structural.adapter.Currently;
import com.zyh.design.structural.adapter.CurrentlyImpl;

/**
 * @author zhuyh
 * @version v1.0
 * @description 案例：一个美国人来中国旅游，中国酒店里提供的电压为220V，美国人需要110V的电压进行充电
 *              这时就需要一个适配器，将220V转为110V以满足美国游客的充电需求
 *        适配器模式：适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 *                  这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 *             结构：
 *             期望/目标接口       {@link com.zyh.design.structural.adapter.Target}
 *             现有接口           {@link Currently}
 *             现有实现           {@link CurrentlyImpl}
 *             适配器            {@link Adapter2}
 *
 *        缺点：过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，
 *        其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，
 *        可以不使用适配器，而是直接对系统进行重构
 *=================================================
 *         注意事项：适配器不是在详细设计时添加的，而是解决正在服役的项目的问题，即现有接口可能无法改变
 *         当我们有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式
 *
 * @date 2024/8/17
 **/
public class AdapterExample {

    public static void main(String[] args) {
        Adapter1 adapter1 = new Adapter1();
        adapter1.chargeBy110V();

        // 现有提供的220V充电环境
        Currently currently = new CurrentlyImpl();
        // 适配器将220V抓换为110V
        Adapter2 adapter = new Adapter2(currently);
        // 使用110V的充电环境进行充电
        adapter.chargeBy110V();


    }
}
