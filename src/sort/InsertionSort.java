package sort;

/**
 * 插入排序
 *
 * 平均时间复杂度  O(n²)
 * 最好时间复杂度  O(n)
 * 最坏时间复杂度  O(n²)
 * 空间复杂度    O(1)
 * 稳定性      稳定
 *
 * @author ：zhaoRuBing
 * @since ：2020-08-19 16:35
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,7,9,8,0,6};
        int[] selectionSort = sort(arr);

        for (int item: selectionSort) {
            System.out.println(item);
        }
    }

    private static int[] sort(int[] arr) {
        int len = arr.length;

        if(len <= 1){
            return arr;
        }

        for (int i = 1; i < len; i++) {
            //要插入的数据
            int temp = arr[i];
            //要插入的位置的前一个位置
            int j = i - 1;
            while (j >= 0 && temp < arr[j]){
                j--;
            }
            //移动数组,k是需要移动的元素的索引
            for (int k = i - 1; k > j; k--) {
                arr[k+1] = arr[k];
            }
            arr[j+1] =temp;
        }

        return arr;
    }


}
