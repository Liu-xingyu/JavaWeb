package yerenpeng.test;

import org.junit.Test;

/**
 * Created by YRP-Laptop on 2017/10/3.
 * 语法糖
 */
public class SyntaxSugar {

    @Test
    public void testSugar() throws Exception {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long l = 3L;
        System.out.println("(a+b)==c:" + ((a + b) == c));
        System.out.println("(c.equals(a+b)):" + (c.equals(a + b)));
        System.out.println("(c==d):" + (c == d));
        System.out.println("(c.equals(d)):" + (c.equals(d)));
        System.out.println("e.equals(f):" + e.equals(f));
        System.out.println("(e==f):" + (e == f));
        System.out.println("(c.equals(l)):" + (c.equals(l)));
    }

}
