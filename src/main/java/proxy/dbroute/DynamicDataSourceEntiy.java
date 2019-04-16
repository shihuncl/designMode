package proxy.dbroute;



/**
 * Created by cl on 2019/4/15.
 */
public class DynamicDataSourceEntiy {

    public final static  String DEFAULE_SOURCE=null;

    private final static ThreadLocal<String> local=new ThreadLocal<String>();

    private DynamicDataSourceEntiy(){}

    public   static String get(){
        return  local.get();
    }

    public static  void  restore(){
        local.set(DEFAULE_SOURCE);
    }

    public   static  void  set(String souce){
        local.set(souce);
    }

    public static  void  set(int year){
        local.set("DB_"+ year);
    }


}
