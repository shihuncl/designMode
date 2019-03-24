package factory.simplefactory;

import factory.ICourse;

/**
 * Created by cl on 2019/3/24.
 *工厂方法
 */
public class CourseFactory {

    /*public ICourse create(String name){
        if("JAVA".equals(name)){
            return new JavaCourse();
        }else  if ("GO".equals(name)){
            return  new GoCourse();
        }
        else {
            return  null;
        }

    }*/

/*    public ICourse create(String className){
        try {

            if(!(className ==null || "".equals(className)) ){

                return (ICourse)Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }*/

    public ICourse create(Class clazz){
        try {

            if(null !=clazz){

                return  (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;

    }

}
