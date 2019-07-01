package observer.gperadvice;

/**
 * Created by cl on 2019/7/1.
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer=GPer.getInstance();
        Teacher teacher=new Teacher("chenlei");

        Question question=new Question();
        question.setUserName("小强");
        question.setContent("观察者模式");
        gPer.addObserver(teacher );
        gPer.publishQuestion(question);

    }
}
