package strategy.pay;

/**
 * Created by cl on 2019/6/17.
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBlance(String uid) {
        return 500;
    }
}
