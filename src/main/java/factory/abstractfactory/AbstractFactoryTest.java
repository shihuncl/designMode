package factory.abstractfactory;

import factory.ICourse;

/**
 * Created by cl on 2019/3/24.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        ICourseFactory factory=new JavaCourseFactory();
        ICourse course=factory.create();
        course.record();
        factory.note().note();

    }
}
