package factory.simplefactory;

/**
 * Created by cl on 2019/3/24.
 *工厂方法
 */
public class CourseFactory {

    public ICourse create(String name){
        if("JAVA".equals(name)){
            return new JavaCourse();
        }else  if ("GO".equals(name)){
            return  new GoCourse();
        }
        else {
            return  null;
        }


    }
}
