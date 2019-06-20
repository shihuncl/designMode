package decorator;

/**
 * Created by cl on 2019/6/20.
 */
public class BattercakeWithEggAndXc extends BattercakeWithEgg{
    @Override
    protected String getMst() {
        return super.getMst()+"加香肠";
    }

    @Override
    public int price() {
        return super.price()+2;
    }
}
