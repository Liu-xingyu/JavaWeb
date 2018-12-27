package yerenpeng.designpattern;

import org.junit.Test;

/**
 * Created by YRP-Laptop on 2018/6/9.
 */
public class PatternTest {

    @Test
    public void testSingleton() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        if (singleton1.equals(singleton2)) {
            System.out.println("单例模式两个对象相同");
            System.out.println("singleton1:" + singleton1);
            System.out.println("singleton2:" + singleton2);
        } else {
            System.err.println("单例模式两个对象不相同");
        }
    }

}
