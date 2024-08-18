package com.zyh.design.structural.bridge.paymodel;

import com.zyh.design.structural.bridge.verification.Verification;

/**
 * @author zhuyh
 * @version v1.0
 * @description 支付宝支付
 * @date 2024/8/18
 **/
public class Alipay extends Pay {
    public Alipay(Verification verification) {
        super(verification);
    }

    @Override
    public boolean transfer(String payInfo) {
        boolean b = verification.examine(payInfo);
        if (b) {
            System.out.println("支付宝支付成功");
            return true;
        }

        System.out.println("支付宝支付失败");
        return false;
    }
}
