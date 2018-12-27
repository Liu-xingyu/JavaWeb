package yerenpeng.designpattern;

/**
 * 单例模式
 * Created by YRP-Laptop on 2018/6/9.
 */
public class Singleton {

    private static Singleton singleton = null;

    public Singleton() {
    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
