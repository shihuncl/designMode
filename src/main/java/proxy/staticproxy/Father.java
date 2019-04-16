package proxy.staticproxy;

/**
 * Created by cl on 2019/4/15.
 */
public class Father  {

    private  Person person;

    public  Father(Person person){
        this.person=person;
    }
    public  void findLove(){
        System.out.println("父亲物色");
        this.person.findLove();
        System.out.println("======");
    }
}
