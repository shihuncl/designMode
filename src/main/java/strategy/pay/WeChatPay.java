package strategy.pay;

/**
 * Created by cl on 2019/6/17.
 */
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBlance(String uid) {
        return 150;
    }
}
