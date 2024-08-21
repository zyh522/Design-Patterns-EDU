package com.zyh.design.structural.proxy.example;

import com.zyh.design.structural.proxy.ProxyOutlet;

/**
 * @author zhuyh
 * @version v1.0
 * @description 代理模式：为其他对象提供一种代理以控制对这个对象的访问。
 *                      也就是说不直接访问目标对象，而是提供代理对象来提供功能。
 *              目的：代理模式解决的是在直接访问某些对象时可能遇到的问题，例如对象创建成本高、需要安全控制或远程访问等
 *              当需要在访问一个对象时进行一些控制或额外处理时可以使用代理模式。
 *        案例：我们购买火车票时，可以到火车站买票，也可以到代售点去买票。这里代售点就相当于火车站的代理对象。
 *
 *
 * @date 2024/8/21
 **/
public class ProxyExample {

    public static void main(String[] args) {

        // 通过代售点买票而不是去火车站买票
        ProxyOutlet proxy = new ProxyOutlet();
        proxy.sale();
    }
}
