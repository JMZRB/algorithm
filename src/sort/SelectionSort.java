package sort;

/**
 * 选择排序
 *
 * 平均时间复杂度  O(n²)
 * 最好时间复杂度  O(n²)
 * 最坏时间复杂度  O(n²)
 * 空间复杂度    O(1)
 * 稳定性      不稳定
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-19 16:26
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,7,9,8,0,6};
        int[] selectionSort = sort(arr);

        for (int item: selectionSort) {
            System.out.println(item);
        }
    }

    private static int[] sort(int[] arr) {
        int len = arr.length;

        //遍历整个数组
        for (int i = 0; i < len; i++) {
            int min = i;
            //遍历无序部分
            for (int j = i + 1; j < len; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
