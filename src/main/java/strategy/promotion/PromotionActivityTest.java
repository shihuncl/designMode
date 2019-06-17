package strategy.promotion;

/**
 * Created by cl on 2019/6/17.
 */
public class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionActivity activity=new PromotionActivity(new CouponStrategy());
        activity.excute();

        String key="GROUPBUY";
        PromotionActivity test=new PromotionActivity(PromontionStrategyFactoty.getPromotionStrategy(key));
        test.excute();

    }
}
