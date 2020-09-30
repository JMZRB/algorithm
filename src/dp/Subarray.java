package dp;

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 * @author ：zhaoRuBing
 * @since ：2020-09-12 12:14
 */
public class Subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        //返回值
        int res = nums[0];

        //状态定义--dp[i]代表以nums[i]结尾的连续子数组和的最大值
        int[] dp = new int[nums.length];

        //初始值
        dp[0] = nums[0];

        //状态转移方程
        for(int i = 1; i < nums.length; i++){
            dp[i] += Math.max(dp[i-1],0) + nums[i];
            res = Math.max(res,dp[i]);
        }

        return res;

    }
}
