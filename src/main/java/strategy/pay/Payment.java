package strategy.pay;

/**
 * Created by cl on 2019/6/17.
 */
public abstract  class Payment {
    public abstract String getName();

    protected abstract double queryBlance(String uid);

    public MsgResult pay(String uid,double amout){
        if(queryBlance(uid)<amout){
            return  new MsgResult(500,"钱不足","支付失败");
        }
        return  new MsgResult(200,"支付成功","支付金额"+amout);
    }
}
