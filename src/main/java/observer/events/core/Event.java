package observer.events.core;

import java.lang.reflect.Method;

/**
 * 监听器的一种包装，观察者
 * Created by cl on 2019/7/1.
 */
public class Event {

    private Object source;
    //通知谁
    private  Object target;
    //回调
    private Method callback;
    //触发什么事件
    private String trigger;
    //触发的时间
    private  long time;

}
