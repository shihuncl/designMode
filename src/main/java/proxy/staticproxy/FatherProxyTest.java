package proxy.staticproxy;

/**
 * Created by cl on 2019/4/15.
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father=new Father(new Son());
        father.findLove();
    }
}
