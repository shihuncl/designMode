package strategy.promotion;

/**
 * Created by cl on 2019/6/17.
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠活动");
    }
}
