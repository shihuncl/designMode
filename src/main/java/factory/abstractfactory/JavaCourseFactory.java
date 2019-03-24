package factory.abstractfactory;


import factory.ICourse;
import factory.JavaCourse;

/**
 * Created by cl on 2019/3/24.
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }

    @Override
    public INote note() {
        return new JavaNote();
    }
}
