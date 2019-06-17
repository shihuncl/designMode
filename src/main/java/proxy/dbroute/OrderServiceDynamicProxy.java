package proxy.dbroute;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cl on 2019/4/15.
 */
public class OrderServiceDynamicProxy implements InvocationHandler{

    private SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");

    Object proxyObj;

    public Object getInstace(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz=proxyObj.getClass();
       return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object=method.invoke(proxyObj,args);
        after();

        return object;
    }

    private void after() {
        //还原成默认得数据源
        System.out.println("结束======");
        DynamicDataSourceEntiy.restore();
    }

    /**
     * order对象
     * @param target
     */
    private void before(Object target) {
        try{
            //进行数据源切换
            System.out.println("开始=======");
            Long time=(Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter=Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到"+dbRouter);
            DynamicDataSourceEntiy.set(dbRouter);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
