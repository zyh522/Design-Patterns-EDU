package com.zyh.design.structural.bridge.paymodel;

import com.zyh.design.structural.bridge.verification.Verification;

/**
 * @author zhuyh
 * @version v1.0
 * @description 微信支付
 * @date 2024/8/18
 **/
public class WxPay extends Pay {

    public WxPay(Verification verification) {
        super(verification);
    }

    @Override
    public boolean transfer(String payInfo) {
        boolean b = verification.examine(payInfo);
        if (b) {
            System.out.println("微信支付成功");
            return true;
        }

        System.out.println("微信支付失败");
        return false;
    }
}
