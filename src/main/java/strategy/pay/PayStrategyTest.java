package strategy.pay;

/**
 * Created by cl on 2019/6/17.
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order=new Order("1","33330",160.00);
        MsgResult msgResult=order.pay(PayStrategy.ALI_PAY);
        System.out.println(msgResult);
        msgResult=order.pay(PayStrategy.WECHAT_PAY);
        System.out.println(msgResult);
    }
}
