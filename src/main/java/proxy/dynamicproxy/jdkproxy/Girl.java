package proxy.dynamicproxy.jdkproxy;

import proxy.staticproxy.Person;

/**
 * Created by cl on 2019/4/16.
 */
public class Girl implements Person{
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("有钱");
    }
}
