package singleton.lazy;

/**
 * Created by cl on 2019/3/24.
 */
public class LazySimpleSingleton {

    public  static  LazySimpleSingleton lazy=null;


    private  LazySimpleSingleton(){}

    /*public  static  LazySimpleSingleton getInstance(){
        //防止重复创建
        if(lazy ==null){
            lazy=new LazySimpleSingleton();
        }

        return lazy;
    }*/

    public synchronized static  LazySimpleSingleton getInstance(){
        //防止重复创建
        if(lazy ==null){
            lazy=new LazySimpleSingleton();
        }

        return lazy;
    }

}
