package factory.factorymethod;

import factory.ICourse;

/**
 * Created by cl on 2019/3/24.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IcourseFactory factory=new JavaFactory();
        ICourse course=factory.create();
        course.record();
    }
}
