package singleton.hungry;

import singleton.lazy.LazySimpleSingleton;

/**
 * Created by cl on 2019/3/24.
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton=LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +"=="+lazySimpleSingleton);
    }
}
