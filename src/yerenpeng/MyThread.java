package yerenpeng;

import java.util.*;

/**
 * Created by YRP-Laptop on 2017/8/31.
 */
public class MyThread implements Runnable {

    private int num;

    public MyThread() {
    }

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("第" + num + "个线程");
        myThread();
    }

    public synchronized void myThread() {
        List<String> features = Arrays.asList("Default Method", "Static Method", "Public Method");
        List<Integer> numbers = Arrays.asList(545, 2, 66, 56, 3, 4, 1, 312, 45, 232, 1, 2, 3, 4);
        Set set = new LinkedHashSet(numbers);
        features.forEach(n -> System.out.println(n));
        set.forEach(i -> System.out.print("Lambda表达式打印的Integer数组:" + i + "  "));
    }
}
