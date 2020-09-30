package sort;

/**
 * @author ：zhaoRuBing
 * @date ：2020-09-28 20:25
 * @Description: TODO   堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,4,7,9,8,0,6};
        heapSort(arr);
        for (int item: arr) {
            System.out.println(item);
        }
    }

    /**
     * 堆排序
     * @param arr
     */
    private static void heapSort(int[] arr){
        int n = arr.length;

        //构建大顶堆
        for (int i = (n-2)/2; i >= 0; i--) {
            downAdjust(arr, i, n-1);
        }

        //进行堆排序
        for (int i = n - 1; i >= 1; i--) {
            //将堆顶元素与第一个元素交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            //恢复二叉堆
            downAdjust(arr,0,i-1);
        }
    }

    /**
     * 下沉操作，构建二叉堆
     * @param arr
     * @param parent
     * @param n
     */
    private static void downAdjust(int[] arr, int parent, int n){
        //临时保存要下沉的元素
        int temp = arr[parent];
        //定位左孩子节点的位置
        int child = 2 * parent + 1;
        //开始下沉
        while (child <= n){
            // 如果右孩子节点比左孩子大，则定位到右孩子
            if(child + 1 <= n && arr[child] < arr[child + 1]){
                child++;
            }
            // 如果孩子节点小于或等于父节点，则下沉结束
            if (arr[child] <= temp ){
                break;
            }
            // 父节点进行下沉
            arr[parent] = arr[child];
            parent = child;
            child = 2 * parent + 1;
        }
        arr[parent] = temp;
    }
}
