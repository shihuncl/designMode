package factory.simplefactory;

/**
 * Created by cl on 2019/3/18.
 */
public class SimpleFactoryTest {




    public static void main(String[] args) {

        CourseFactory courseFactory=new CourseFactory();
        ICourse course=courseFactory.create("JAVA");
        course.record();
        ICourse course1=courseFactory.create("GO");
        course1.record();
    }
}
