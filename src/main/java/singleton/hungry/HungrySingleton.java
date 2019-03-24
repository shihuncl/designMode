package singleton.hungry;

/**
 * Created by cl on 2019/3/24.
 * 不管调用不调用都会去创建对象
 */
public class HungrySingleton {

    public  static final  HungrySingleton hungrySingleton=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
