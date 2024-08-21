package com.zyh.design.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/21
 **/
public class MyInvocationHandler implements InvocationHandler {

    private final Object o;

    public MyInvocationHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("执行目标方法前=========");
        Object result = method.invoke(o, args);
        System.out.println("执行目标方法后=========");
        return result;
    }
}
