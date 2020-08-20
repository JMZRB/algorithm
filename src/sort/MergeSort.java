package sort;

/**
 * 归并排序
 * @author ：zhaoRuBing
 * @since ：2020-08-19 19:05
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,7,9,8,0,6};
        int[] selectionSort = sort(arr, 0, arr.length-1);
//        int[] selectionSort = sort2(arr);
        for (int item: selectionSort) {
            System.out.println(item);
        }
    }

    /**
     * 递归式归并排序(分而治之)
     * @param arr
     * @return
     */
    private static int[] sort(int[] arr, int left, int right) {
        //递归结束的条件：递归到只有一个元素，即left == right
        if(left < right){
            //分
            int mid = left + (right - left) / 2;
            //治
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            //合
            merge(arr, left, mid, right);
        }

        return arr;
    }

    /**
     * 合并有序数组
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j= mid + 1;
        int[] temp =new int[right - left + 1];

        for (int k = 0; k < temp.length ; k++) {
            //如果左边（右边）数组元素取完，则直接复制右边（左边）数组
            if(i > mid) {
                temp[k] = arr[j++];
            }else if(j > right) {
                temp[k] = arr[i++];
            }else if(arr[i] <= arr[j]){
                temp[k] = arr[i++];
            }else {
                temp[k] = arr[j++];
            }
        }

        //将临时数组的值复制到原数组 arr 中
        for (int k = 0; k < temp.length ; k++) {
            arr[left++] = temp[k];
        }
    }

    /**
     * 非递归归并排序
     * @param arr
     * @return
     */
    private static int[] sort2(int[] arr) {

        return arr;
    }
}
