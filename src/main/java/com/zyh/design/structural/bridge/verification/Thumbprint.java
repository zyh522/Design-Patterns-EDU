package com.zyh.design.structural.bridge.verification;

/**
 * @author zhuyh
 * @version v1.0
 * @description 指纹校验
 * @date 2024/8/18
 **/
public class Thumbprint implements Verification {

    @Override
    public boolean examine(String param) {
        System.out.printf("指纹识别正在校验，参数%s\n", param);
        return true;
    }
}
