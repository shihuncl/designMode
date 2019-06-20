package decorator.v2;

/**
 * Created by cl on 2019/6/20.
 */
public class EggDecorator extends BattercakeDecorator{
    @Override
    protected String getMsg() {
        return super.getMsg()+"1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }
}
