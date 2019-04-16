package proxy.dynamicproxy.jdkproxy;

import proxy.staticproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by cl on 2019/4/16.
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {

            Person obj=(Person) new JDKMeiPo().getInstace(new Girl());
            obj.findLove();
            byte [] bytes= ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os= new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
