package yerenpeng.algorithm;

/**
 * 数据结构几种基本排序算法
 * Created by YRP-Laptop on 2018/4/22.
 */
public class Algorithm {

    public static void main(String[] args) throws Exception {
        int[] arrs = new int[]{2, 4, 1, 23, 5, 3, 8, 7};

        /*System.out.println("冒泡排序之后的数组：");
        for (int i : bubbleSort(arrs)) {
            System.out.print(i + " ");
        }*/

        Long s_time = System.nanoTime();
        System.out.println("快速排序之后的数组：");
        for (int i : quickSort(arrs, 0, arrs.length - 1)) {
            System.out.print(i + " ");
        }
        Long e_time = System.nanoTime();
        System.out.println("排序总耗时：" + (e_time - s_time) + "ns");

    }

    // 冒泡排序算法
    public static int[] bubbleSort(int[] arrs) throws Exception {
        int len = arrs.length;
        for (int i = 0; i < len; ++i) {
            for (int j = i; j < len; ++j) {
                if (arrs[i] > arrs[j]) {
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        return arrs;
    }

    // 快速排序（递归实现）
    public static int[] quickSort(int[] arrs, int low, int high) throws Exception {
        if (low < high) {
            int left = low, right = high;
            int pivot = arrs[left];

            while (left <= right) {

                while (arrs[left] < pivot) {
                    left++;
                }

                while (arrs[right] > pivot) {
                    right--;
                }

                if (left <= right) {
                    int temp = arrs[left];
                    arrs[left] = arrs[right];
                    arrs[right] = temp;
                    left++;
                    right--;
                }
            }
            quickSort(arrs, low, right);
            quickSort(arrs, left, high);
        }

        return arrs;
    }
}
