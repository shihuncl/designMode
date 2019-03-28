package singleton.lazy;

/**
 * Created by cl on 2019/3/24.
 */
public class LazyDoubleSingleton {

    public  static  LazyDoubleSingleton lazy=null;


    private  LazyDoubleSingleton(){}




    public  static  LazyDoubleSingleton getInstance(){
        //防止重复创建
        if(lazy ==null){
            synchronized (LazySimpleSingleton.class){
                if(lazy ==null){
                    lazy=new LazyDoubleSingleton();
                }
            }

        }

        return lazy;
    }
}
