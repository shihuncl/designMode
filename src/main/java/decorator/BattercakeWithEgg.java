package decorator;

/**
 * Created by cl on 2019/6/20.
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getMst() {
        return super.getMst()+"+1个鸡蛋";
    }

    @Override
    public int price() {
        return super.price()+1;
    }
}
