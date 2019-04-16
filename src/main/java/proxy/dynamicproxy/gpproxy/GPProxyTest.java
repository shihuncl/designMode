package proxy.dynamicproxy.gpproxy;

import proxy.dynamicproxy.jdkproxy.Girl;
import proxy.staticproxy.Person;

/**
 * Created by cl on 2019/4/16.
 */
public class GPProxyTest {
    public static void main(String[] args) {
        try {

            Person obj=(Person) new GPMeipo().getInstace(new Girl());
            obj.findLove();
            /*byte [] bytes= ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os= new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
