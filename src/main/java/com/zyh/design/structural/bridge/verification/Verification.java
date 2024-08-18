package com.zyh.design.structural.bridge.verification;

/**
 * @author zhuyh
 * @version v1.0
 * @description 校验接口
 * @date 2024/8/18
 **/
public interface Verification {

    /**
     * 校验密码
     *
     * @param param 校验参数
     *
     * @return 是否通过 true表示校验通过
     */
    boolean examine(String param);
}