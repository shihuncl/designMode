package proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * Created by cl on 2019/4/16.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
