package proxy.dynamicproxy.gpproxy;

import proxy.staticproxy.Person;

import java.lang.reflect.Method;

/**
 * Created by cl on 2019/4/16.
 */
public class GPMeipo implements GPInvocationHandler{


    private Person target;

    public Object getInstace(Person person)throws  Exception{
        this.target=person;
        Class<?> clazz=target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
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
