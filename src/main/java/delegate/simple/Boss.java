package delegate.simple;

/**
 * Created by cl on 2019/6/17.
 */
public class Boss {


    public  void command(String command,Leader leader){
        leader.doing(command);
    }

    public static void main(String[] args) {
        new Boss().command("加密",new Leader());
        new Boss().command("架构",new Leader());
    }
}
