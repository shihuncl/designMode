package proxy.dynamicproxy.jdkproxy;

import proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by cl on 2019/4/16.
 */
public class JDKMeiPo implements InvocationHandler {

    private Person target;

    public Object getInstace(Person person)throws  Exception{
        this.target=person;
        Class<?> clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object= method.invoke(this.target,args);
        after();
        return object;
    }

    private void before(){
        System.out.println("执行前");
    }
    private  void after(){
        System.out.println("执行后");
    }
}
