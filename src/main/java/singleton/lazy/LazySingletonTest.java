package singleton.lazy;

import singleton.hungry.ExectorThread;

/**
 * Created by cl on 2019/3/24.
 */
public class LazySingletonTest {
    public static void main(String[] args) {

        Thread thread=new Thread(new ExectorThread());
        Thread thread1=new Thread(new ExectorThread());

        thread.start();
        thread1.start();
        System.out.println("===========");

    }
}
