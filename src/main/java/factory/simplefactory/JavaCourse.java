package factory.simplefactory;

/**
 * Created by cl on 2019/3/18.
 */
public class JavaCourse implements ICourse {


    @Override
    public void record() {
        System.out.println("JAVA课程学习");
    }
}
