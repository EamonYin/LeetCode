/**
 * @author:YiMing
 * @create:2020/7/7,18:29
 * @version:1.0
 * 1480. 一维数组的动态和
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 */
public class runningSum {
    public int[] runningSum(int[] nums) {
        int[] nums2 = new int[nums.length];
        nums2[0] = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            nums2[i] = sum;
        }
        return nums2;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        runningSum oda = new runningSum();
        int[] numss = oda.runningSum(nums);

        for (int i : numss) {
            System.out.print(i+" ");
        }
    }
}
