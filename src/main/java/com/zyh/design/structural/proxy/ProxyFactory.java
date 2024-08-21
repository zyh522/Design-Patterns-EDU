package com.zyh.design.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/21
 **/
public class ProxyFactory {

    private ProxyFactory() {
    }

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandler(target));
    }
}
