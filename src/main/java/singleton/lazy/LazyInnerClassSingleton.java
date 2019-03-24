package singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * Created by cl on 2019/3/24.
 */
public class LazyInnerClassSingleton {

    private  LazyInnerClassSingleton(){
        if(LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许重复构建");
        }
    }

    /**
     * LazyHolder需要等到外部方法调用才执行（内部类的特性）
     * 反射调用构造方法还会存在线程问题
     * @return
     */
    public  static  final  LazyInnerClassSingleton getInstace(){

        return LazyHolder.LAZY;
    }

    private static class  LazyHolder{
        private  static final LazyInnerClassSingleton LAZY=new LazyInnerClassSingleton();
    }


    public static void main(String[] args) {

        try {
            Class <?> clazz=LazyInnerClassSingleton.class;
            Constructor constructor=clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            Object o=constructor.newInstance();
            Object o1=LazyInnerClassSingleton.getInstace();
            System.out.println(o=o1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
