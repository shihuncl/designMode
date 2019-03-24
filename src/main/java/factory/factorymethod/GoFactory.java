package factory.factorymethod;

import factory.GoCourse;
import factory.ICourse;

/**
 * Created by cl on 2019/3/24.
 */
public class GoFactory implements IcourseFactory {
    @Override
    public ICourse create() {
        return new GoCourse();
    }
}
