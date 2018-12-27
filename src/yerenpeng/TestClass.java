package yerenpeng;

import org.junit.Test;

/**
 * Created by YRP-Laptop on 2017/8/31.
 */
public class TestClass {

    @Test
    public void testThread() throws Exception {
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread((i + 1));
            new Thread(thread).start();
        }
    }
}
