package decorator;

/**
 * Created by cl on 2019/6/20.
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake=new Battercake();
        System.out.println(battercake.getMst()+",总价格"+battercake.price());
        BattercakeWithEgg battercakeWithEgg=new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMst()+",总价格"+battercakeWithEgg.price());
    }
}
