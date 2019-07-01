package observer.events.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cl on 2019/7/1.
 */
public class EventLisenter {

    protected Map<String,EventLisenter> events=new HashMap<>();

    public void addLisenter(String evenType,Object target){

    }

    /*public void addLisenter(){
        events.put(eventType,new Event(target,callback));
    }*/
}
