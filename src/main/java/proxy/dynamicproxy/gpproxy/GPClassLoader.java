package proxy.dynamicproxy.gpproxy;

import java.io.File;

/**
 * Created by cl on 2019/4/16.
 */
public class GPClassLoader extends ClassLoader{


    private File classPathFile;
    public GPClassLoader(){
        //String classPath=
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className=GPClassLoader.class.getPackage().getName()+"."+name;
        /*if(){

        }*/
        return super.findClass(name);
    }
}
