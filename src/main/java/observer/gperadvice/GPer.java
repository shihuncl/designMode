package observer.gperadvice;

import java.util.Observable;

/**
 * Created by cl on 2019/7/1.
 */
public class GPer extends Observable{
    private String name="生态圈";

    private static GPer gPer=null;

    public GPer() {
    }

    public static  GPer getInstance(){
        if(null ==gPer){
            gPer=new GPer();
        }
        return  gPer;
    }

    public String getName(){
        return name;
    }

    public  void publishQuestion(Question question){
        System.out.println(question.getContent()+this.name+question.getUserName()+"问题");
        setChanged();
        notifyObservers(question);
    }
}
