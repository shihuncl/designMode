package decorator.v2;

/**
 * Created by cl on 2019/6/20.
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake;
        battercake=new BaseBattercake();
        battercake=new EggDecorator(battercake);
        battercake=new EggDecorator(battercake);
        System.out.println(battercake.getMsg()+battercake.getPrice());
    }
}
