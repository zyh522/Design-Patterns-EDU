package com.zyh.design.structural.bridge.example;

import com.zyh.design.structural.bridge.paymodel.Alipay;
import com.zyh.design.structural.bridge.paymodel.Pay;
import com.zyh.design.structural.bridge.paymodel.WxPay;
import com.zyh.design.structural.bridge.verification.FaceRecognition;
import com.zyh.design.structural.bridge.verification.Thumbprint;

/**
 * @author zhuyh
 * @version v1.0
 * @description 支付案例
 *
 *          案例2：现实生活中，手机支付方式有支付宝支付和微信支付等等。而在支付的时候又有不同的校验方式，
 *            例如密码校验、人脸校验、指纹校验、免密支付等等。若不将支付方式与支付校验方式分离，伪代码如下：
 *            if("支付宝"== payMode){
 *                if("人脸" == verification){
 *                    ...
 *                }else if("指纹" == verification){
 *                    ...
 *                }else if("密码" == verification){
 *                    ...
 *                }
 *            }else if("微信"== payMode){
 *                    if("人脸" == verification){
 *                        ...
 *                    }else if("指纹" == verification){
 *                        ...
 *                    }else if("密码" == verification){
 *                        ...
 *                 }
 *            若要新增支付方式或者支付校验方式，需修改代码并且重复代码增多。如何解决？
 *            使用桥接模式，将两者分离，在选择支付方式时传入支付校验方式。{@link BridgeExample2}
 *
 *
 *      将支付方式与校验方式隔离，两者可以独立变化，如增加校验方式只需实现Verification接口
 *      在支付时将新增的校验方式传入即可。新增支付方式也可以使用原有的校验方式组合，两者解耦合
 *          使用场景：
 *              当系统可能从多个角度进行分类，且每个角度都可能独立变化时，桥接模式是合适的。
 *
 *
 * @date 2024/8/18
 **/
public class BridgeExample2 {

    public static void main(String[] args) {
        // 支付宝支付，使用人脸识别的校验方式
        Pay alipay = new Alipay(new FaceRecognition());
        boolean b = alipay.transfer("用户id：111");
        System.out.println(b);

        // 微信支付，使用指纹识别的校验方式
        Pay wxPay = new WxPay(new Thumbprint());
        boolean b1 = wxPay.transfer("用户id：222");
        System.out.println(b1);
    }
}
