package yerenpeng.algorithm;

import org.junit.Test;

/**
 * 输出图形
 * <p>
 * Created by YRP-Laptop on 2018/6/9.
 */
public class Graphic {

    public static void printGraphic(int num) {
        if (num <= 0) return;

        // i表示行数
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++)
                System.out.print(" ");//根据外层行号，输出星号个数

            // 打印规则：N = 2*R-1  N个数，R行数
            /*for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");//一行结束，换行*/

            // 打印规则：N = R  N个数，R行数
            for (int k = 1; k <= i; k++)
                System.out.print("* ");//一行结束，换行


            System.out.printf("\n");
        }
    }

    @Test
    public void testOne() {
        printGraphic(6);
    }

}
