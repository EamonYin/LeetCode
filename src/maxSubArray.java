/**
 * @Author XiaoMing
 * @create 2020/4/23 18:21
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class maxSubArray {
    //动态规划
    public int maxSubArray(int[] nums) {
        int answer = nums[0];
        int sum = 0;
        for (int num : nums) {
            //sum是正数，结果相加
            if (sum > 0) {
                sum += num ;
            } else {//sum是负数，没有增益效果，所以将现在的num赋给sum
                sum = num ;
            }
            answer = Math.max(answer , sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray maxSubArray = new maxSubArray();
        int i = maxSubArray.maxSubArray(nums);
        System.out.println(i);
    }
}
