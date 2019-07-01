package observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cl on 2019/7/1.
 */
public class Teacher implements Observer {

    private  String name;

    public  Teacher(String name){
        this.name=name;
    }


    public void update(Observable o, Object arg) {
        GPer gPer= (GPer) o;
        Question question= (Question) arg;
        System.out.println(gPer.getName()+question.getContent()+question.getContent());
        System.out.println("=========");
    }
}
