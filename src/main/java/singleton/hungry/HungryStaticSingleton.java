package singleton.hungry;

/**
 * Created by cl on 2019/3/24.
 */
public class HungryStaticSingleton {

    public  static final  HungryStaticSingleton hungrySingleton;

    static {

        hungrySingleton= new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }

}
