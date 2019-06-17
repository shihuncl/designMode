package strategy.promotion;

/**
 * Created by cl on 2019/6/17.
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领券消费");
    }
}
