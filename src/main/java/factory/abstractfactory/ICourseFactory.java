package factory.abstractfactory;

import factory.ICourse;

/**
 * Created by cl on 2019/3/24.
 */
public interface ICourseFactory {

    ICourse create();
    INote note();
}
