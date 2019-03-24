package factory.simplefactory;

/**
 * Created by cl on 2019/3/24.
 */
public class GoCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("Go课程学习");
    }
}
