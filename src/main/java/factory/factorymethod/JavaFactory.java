package factory.factorymethod;

import factory.ICourse;
import factory.JavaCourse;

/**
 * Created by cl on 2019/3/24.
 */
public class JavaFactory implements IcourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
