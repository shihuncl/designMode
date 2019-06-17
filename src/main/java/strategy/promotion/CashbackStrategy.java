package strategy.promotion;

/**
 * Created by cl on 2019/6/17.
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
