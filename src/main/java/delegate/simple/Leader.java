package delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cl on 2019/6/17.
 */
public class Leader {
    //知道特征分发任务

    private Map<String,IEmployee> register=new HashMap<>();
    public Leader(){
        register.put("加密",new EmployeeA());
        register.put("架构",new EmployeeB());
    }

    public void doing(String command){

        register.get(command).doing(command);
    }
}
