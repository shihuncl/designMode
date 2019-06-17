package strategy.promotion;

/**
 * Created by cl on 2019/6/17.
 */
public class GroupbuyStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满20人成团，团购价");
    }
}
