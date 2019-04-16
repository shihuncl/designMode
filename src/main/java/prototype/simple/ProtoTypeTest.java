package prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cl on 2019/4/15.
 */
public class ProtoTypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("chenlei");
        List hobbies=new ArrayList<String>();
        hobbies.add("basketball");
        concretePrototypeA.setHobbies(hobbies);

        Client client=new Client();
       ConcretePrototypeA copy= (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(copy);
        System.out.println("克隆值对象："+copy.getHobbies());
        System.out.println("原对象中得引用地址得值"+concretePrototypeA.getHobbies());
        System.out.println(copy.getHobbies()==concretePrototypeA.getHobbies());
    }

}
