package yerenpeng.thread;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: YeRenpeng
 * @e-mail: abc8737@163.com
 * @github: https://github.com/Liu-xingyu
 * @Date: 2018/11/10 12:17
 * @Version 1.0
 */
public class TestThread {

    public static Runnable myRunnable(String info) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("测试线程的启动与应用," + info);
            }
        };
    }

    public static Thread myThread(String info) {

        return new Thread(() -> {
            try {
                Thread.sleep(6000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(info);
        });
    }

    public static Thread myThreadLoop(String name, int count) {
        return new Thread(() -> {
            try {
                for (int i = 1; i <= count; i++) {
                    System.out.println(name + ":" + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static Runnable myRunnableLoop(String name, int count) {
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= count; i++) {
                    System.out.println(name + ":" + i);
                }
            }
        };
    }

    @Test
    public void testRunnable() {
        Long startTime1 = System.currentTimeMillis();
        new Thread(myRunnable("线程1")).start();
        System.out.println((System.currentTimeMillis() - startTime1) + "ms");

        Long startTime2 = System.currentTimeMillis();
        new Thread(myRunnable("线程2")).start();
        System.out.println((System.currentTimeMillis() - startTime2) + "ms");

        int i = 10;
        while (i != 0) {
            new Thread(myRunnableLoop("Runnable测试启动多个线程打印数据" + i, 4)).start();
            i--;
        }
    }

    @Test
    public void testThread() {
        Long startTime1 = System.currentTimeMillis();
        myThread("testThread测试线程1").start();
        System.out.println((System.currentTimeMillis() - startTime1) + "ms");

        Long startTime2 = System.currentTimeMillis();
        myThread("testThread测试线程2").start();
        System.out.println((System.currentTimeMillis() - startTime2) + "ms");

        for (int i = 1; i <= 10; i++) {
            myThreadLoop("Thread测试启动多个线程" + i, 1).start();
        }
    }

    @Test
    public void testRetreenLockThread() {
        System.err.println("=======================可重入锁线程测试=======================");
        for (int i = 10; i > 0; i--) {
            new Thread(new MyRetreenLockThread("thread" + i)).start();
        }
//        MyRetreenLockThread retreenLockThread = new MyRetreenLockThread("可重入锁线程测试");
    }

    @Test
    public void testhashMap() {
        Map map = new HashMap(25, 0.5f);
        for (int i = 0; i < 25; i++) {
            map.put("key_" + i, i);
        }
        Set keySet = map.keySet();
        keySet.forEach((key) -> System.out.println(key + " = " + map.get(key) + ",key的hashcode=" + Integer.toHexString(key.hashCode())));
    }

}
