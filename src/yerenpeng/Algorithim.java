package yerenpeng;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by YRP-Laptop on 2017/7/15.
 */
public class Algorithim {

    public static int[] arrVals = {2, 1, 0, 23, 1, 21, 75, 25, 14};

    public static final String REGX_STR1 = "^\\d+$";
    public static final String REGX_STR2 = "^[a-z0-9A-Z]{6,18}$";
    public static final String REGX_STR3 = "^\\w$";

    public static final String TEST_STR = "12345";

    public static boolean matchRegx(String regxStr, String inputStr) {
        Pattern pattern = Pattern.compile(regxStr);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

    @Test
    public void testRegx() throws Exception {
        System.out.println(matchRegx(REGX_STR1, TEST_STR));
        System.out.println(matchRegx(REGX_STR2, TEST_STR));
        System.out.println(matchRegx(REGX_STR3, TEST_STR));
    }

    @Test
    public void testOne() throws Exception {
        /**
         * 6>>1  带符号向右移位运算  -6>>1 = -3
         * -6>>>1 不带符号运算
         */
        System.out.println(-6 >> 1);
        System.out.print(0xff);
    }

    public static void removeDuplicateChar(String str) {
        if (str == null) return;
        char[] cs = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        List charList = new ArrayList();
        for (int i = 0; i < cs.length; ++i) {
            if (!charList.contains(cs[i])) {
                builder.append(cs[i]);
                charList.add(cs[i]);
            }
        }
        System.out.println(builder.toString());
    }

    @Test
    public void testChar() {
        removeDuplicateChar("floor");
    }

    // 分数排名
    public static void rankScore(int[] scores) throws Exception {
        if (scores.length == 0) return;
        int[] ranks = new int[scores.length];
        for (int i = 0; i < scores.length; ++i) {
            int tempRank = 1;
            for (int j = i; j < scores.length; ++j) {

            }

        }

    }

    @Test
    public void testEquals() throws Exception {
        Integer i1 = 123;
        Integer i2 = 123;
        Integer i3 = new Integer(123);
        Integer i4 = 234;
        Integer i5 = 234;
        System.out.println("i1==i2===>" + (i1 == i2));
        System.out.println("i1==i3===>" + (i1 == i3));
        System.out.println("i4==i5===>" + (i4 == i5));
        System.out.println("null==i3===>" + (null == i3));

        String s1 = "abc";
        String s2 = "a";
        String s3 = "bc";
        String s4 = "abc";
        String s5 = new String("abc");

        Map map = new HashMap<>();
        map.put(null, null);
        System.out.println(map.get(null));

        System.out.println("hashcode==" + Integer.toHexString(hashCode()));
        System.out.println("s1=(s2+s3)==>" + (s1 == (s2 + s3)));
        System.out.println("(s1==s4)==>" + (s1 == s4));
        System.out.println("(s1==s5)==>" + (s1 == s5));
        System.out.println("(s1.equals(s5))==>" + (s1.equals(s5)));
    }

    @Test
    public void testSortAlgorithm() {
//        bubbleSort(arrVals);
        quickSort(arrVals, 0, arrVals.length - 1);
//        insertSort(arrVals);
//        shellSort(arrVals);
        Arrays.stream(arrVals).forEach(s -> System.out.print(s + " "));
    }

    /**
     * 对几种基本排序算法进行汇总并编码
     * 1.交换排序
     * 1-1 冒泡排序
     * 1-2 快速排序
     * 2.插入排序
     * 2-1 直接插入排序
     * 2-2 希尔排序
     * 3.选择排序
     * 3-1 简单选择排序
     * 3-2 堆排序
     * 4.归并排序
     * 5.基数排序
     */

    // 冒泡排序
    public static void bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - i - 1; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
        }
    }

    // 快速排序
    public static void quickSort(int[] arrs, int low, int high) {
        if (low >= high) return;
        int left = low, right = high, pivot = arrs[(low + high) / 2];
        while (left < right) {

            while (left < right && arrs[left] <= pivot)
                left++;

            while (left < right && arrs[right] >= pivot)
                right--;

            if (left < right) {
                int temp = arrs[left];
                arrs[left] = arrs[right];
                arrs[right] = temp;
            }
        }

        quickSort(arrs, low, left-1);
        quickSort(arrs, left + 1, high);
    }

    // 直接插入排序
    public static void insertSort(int[] arrs) {

        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arrs[j - 1] > arrs[j]) {
                    int temp = arrs[j - 1];
                    arrs[j - 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }

    }

    // 希尔排序
    public static void shellSort(int[] arrs) {

        for (int step = (arrs.length / 2); step > 0; step--) {

            for (int i = 0; i < arrs.length - step; i += step) {
                for (int j = i + step; j > 0; j -= step) {
                    if (arrs[j - step] > arrs[j]) {
                        int temp = arrs[j - step];
                        arrs[j - step] = arrs[j];
                        arrs[j] = temp;
                    }
                }
            }

        }

    }

    // 简单排序
    public static void simpleSort(int[] arrs) {

    }

    // 堆排序
    public static void heapSort(int[] arrs) {

    }

    // 归并排序
    public static void mergeSort(int[] arrs) {

    }

    // 基数排序
    public static void baselineSort(int[] arrs) {

    }
}
