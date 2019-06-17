package strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cl on 2019/6/17.
 */
public class PromontionStrategyFactoty {

    //注册式单例,工厂方法
    private static Map<String,PromotionStrategy> P_MAP=new HashMap<>();

    static {
        P_MAP.put(PromontionKey.COUPON,new CouponStrategy());
        P_MAP.put(PromontionKey.CASHBACK,new CashbackStrategy());
        P_MAP.put(PromontionKey.GROUPBUY,new GroupbuyStrategy());
    }

    private static final PromotionStrategy NON_PROMONTION=new EmptyStrategy();

    private PromontionStrategyFactoty(){}

    public static PromotionStrategy getPromotionStrategy(String promontionKey){
        PromotionStrategy promotionStrategy=P_MAP.get(promontionKey);
        return  promotionStrategy == null?NON_PROMONTION:promotionStrategy;
    }

    private interface PromontionKey{
        String COUPON="COUPON";
        String CASHBACK="CASHBACK";
        String GROUPBUY="GROUPBUY";
    }


}
