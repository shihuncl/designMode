package singleton.regist;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by cl on 2019/3/28.
 * spring容器注册方法
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private  static Map<String,Object> ioc=new ConcurrentHashMap<String,Object>();

    private static Object getBean(String className){

        synchronized (ioc){
            if(!ioc.containsKey(className)){

                Object obj=null;
                try {
                    obj=Class.forName(className).newInstance();
                    ioc.put(className,obj);

                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;

            }
        }

        return ioc.get(className);
    }

    public static void main(String[] args) {

        Object obj=ContainerSingleton.getBean("singleton.regist.Pojo");
        System.out.println(obj);
    }

}
