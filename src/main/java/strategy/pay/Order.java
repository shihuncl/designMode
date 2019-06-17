package strategy.pay;

/**
 * Created by cl on 2019/6/17.
 */
public class Order {
    private  String uid;
    private  String orderId;
    private double amout;

    public Order(String uid, String orderId, double amout) {
        this.uid = uid;
        this.orderId = orderId;
        this.amout = amout;
    }

    public MsgResult pay(String payKey){
        Payment payment=PayStrategy.get(payKey);
        System.out.println("欢迎使用"+payment.getName());
        return  payment.pay(uid,amout);

    }

}
