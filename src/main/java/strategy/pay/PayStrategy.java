package strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cl on 2019/6/17.
 */
public class PayStrategy {
    //工厂，单例

    public  static  final String ALI_PAY="Alipay";
    public  static  final String WECHAT_PAY="Wechatpay";

    private static Map<String,Payment> paymentMap=new HashMap<>();

    static {
        paymentMap.put(ALI_PAY,new AliPay());
        paymentMap.put(WECHAT_PAY,new WeChatPay());
    }

    public static Payment get(String payKey){
        /*if(!paymentMap.containsKey(payKey)){

        }*/
        return paymentMap.get(payKey);
    }
}
