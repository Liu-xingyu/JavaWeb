package yerenpeng.othersyntax;

/**
 * Created by YRP-Laptop on 2018/1/13.
 */
public class TestCode {

    public static void main(String[] args) throws Exception {
        TestSyntax syntax = new TestSyntax(1, 150, 3);
        System.out.println("符合条件的数字总和：" + syntax.completeNum());
    }
}
