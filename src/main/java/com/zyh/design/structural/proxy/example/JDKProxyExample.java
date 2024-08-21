package com.zyh.design.structural.proxy.example;

import com.zyh.design.structural.proxy.ProxyFactory;
import com.zyh.design.structural.proxy.SendMsg;
import com.zyh.design.structural.proxy.SendMsgImpl;

/**
 * @author zhuyh
 * @version v1.0
 * @description jdk动态代理: 动态代理相较于静态代理更加灵活，不需要给每个目标类都新建一个代理类，而是通过反射机制动态生成代理对象
 * <p>
 *    使用： 定义一个接口                              {@link com.zyh.design.structural.proxy.SendMsg}
 *          接口的实现类                              {@link com.zyh.design.structural.proxy.SendMsgImpl}
 *          自定义Invocation实现InvocationHandler     {@link com.zyh.design.structural.proxy.MyInvocationHandler}
 *          创建代理对象Proxy.newProxyInstance()
 * </p>
 * @date 2024/8/21
 **/
public class JDKProxyExample {

    public static void main(String[] args) {

        // 获取代理对象
        SendMsg proxy = (SendMsg) ProxyFactory.getProxy(new SendMsgImpl());
        proxy.send();
    }

}
