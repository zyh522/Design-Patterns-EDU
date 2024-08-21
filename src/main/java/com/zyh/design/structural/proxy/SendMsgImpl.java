package com.zyh.design.structural.proxy;

/**
 * @author zhuyh
 * @version v1.0
 * @description
 * @date 2024/8/21
 **/
public class SendMsgImpl implements SendMsg{
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
