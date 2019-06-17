package strategy.promotion;

/**
 * Created by cl on 2019/6/17.
 */
public class PromotionActivity {
    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute(){
        this.promotionStrategy.doPromotion();
    }
}
