package search;

/**
 * 二分法
 * 搜索和目标值相等的数,返回下标
 * @author ：zhaoRuBing
 * @since ：2020-08-19 19:12
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,7,9,8,0,6};
        int binarySearch = binarySearch(arr,7);
        System.out.println(binarySearch);
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left)/2;

        while (left <= right){
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else {
                left =  mid + 1;
            }
        }

        return -1;
    }
}
