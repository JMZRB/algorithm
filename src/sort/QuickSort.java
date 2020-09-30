package sort;

/**
 * @author ：zhaoRuBing
 * @date ：2020-09-20 10:44
 * @Description: TODO   快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,7,9,8,0,6};

        quickSort(arr, 0, arr.length - 1);
        for (int item:arr) {
            System.out.println(item);
        }
    }

    /**
     * 递归快排
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static void quickSort(int[] arr, int left, int right){
        if (left < right){
            int mid = partition(arr,left,right);
            quickSort(arr,left,mid-1);
            quickSort(arr,mid+1,right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && arr[j] >= pivot){
                j--;
            }
            while(i < j && arr[i] <= pivot){
                i++;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[i];
        arr[i] = pivot;

        return i;
    }
}
