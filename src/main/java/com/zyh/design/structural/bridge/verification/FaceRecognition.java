package com.zyh.design.structural.bridge.verification;

/**
 * @author zhuyh
 * @version v1.0
 * @description 人脸识别
 * @date 2024/8/18
 **/
public class FaceRecognition implements Verification {


    @Override
    public boolean examine(String param) {
        // 进行校验
        System.out.printf("人脸识别正在校验，参数为%s\n", param);
        return true;
    }
}
