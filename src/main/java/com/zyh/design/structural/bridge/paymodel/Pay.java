package com.zyh.design.structural.bridge.paymodel;

import com.zyh.design.structural.bridge.verification.Verification;

/**
 * @author zhuyh
 * @version v1.0
 * @description 支付抽象类
 * @date 2024/8/18
 **/
public abstract class Pay {

    protected Verification verification;

    public Pay(Verification verification) {
        this.verification = verification;
    }

    /**
     * 转账
     *
     * @param payInfo 支付信息
     *
     * @return 是否支付成功 true表示支付成功
     */
    public abstract boolean transfer(String payInfo);
}
