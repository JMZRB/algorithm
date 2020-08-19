package sort;

/**
 * 冒泡排序
 *
 * 平均时间复杂度  O(n²)
 * 最好时间复杂度  O(n)
 * 最坏时间复杂度  O(n²)
 * 空间复杂度    O(1)
 * 稳定性      稳定
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-19 16:37
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,7,9,8,0,6};
//        int[] selectionSort = sort(arr);
        int[] selectionSort = sort2(arr);
        for (int item: selectionSort) {
            System.out.println(item);
        }
    }
    
    private static int[] sort(int[] arr) {
        int len = arr.length;
        if(len <= 1){
            return arr;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序优化
     * @param arr
     * @return
     */
    private static int[] sort2(int[] arr) {
        int len = arr.length;
        if(len <= 1){
            return arr;
        }
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len - i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag){
                break;
            }
        }
        return arr;
    }
}
