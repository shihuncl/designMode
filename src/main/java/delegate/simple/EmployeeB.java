package delegate.simple;

/**
 * Created by cl on 2019/6/17.
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("B员工"+command);
    }
}
