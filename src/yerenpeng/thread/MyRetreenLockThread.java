package yerenpeng.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/**
 * 线程可重入锁
 *
 * @Author: YeRenpeng
 * @e-mail: abc8737@163.com
 * @github: https://github.com/Liu-xingyu
 * @Date: 2018/11/15 22:07
 * @Version 1.0
 */
public class MyRetreenLockThread implements Runnable {

    public static int num = 10;                // 计数

    public Lock lock = new ReentrantLock();    // 可重入锁变量

    public String thread_name;                 // 线程名称

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public MyRetreenLockThread(String thread_name) {
        this.thread_name = thread_name;
        logger.info("info消息");
    }

    private void sayHello() {
        lock.lock();
        System.out.println(thread_name + "线程调用了sayHello方法");
        lock.unlock();
    }

    @Override
    public void run() {
        lock.lock();
        try {
            if (num > 0) {
                System.out.println("当前线程是" + thread_name + ",正在测试num=" + num);
                sayHello();
                num--;
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
