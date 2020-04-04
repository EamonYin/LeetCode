import java.util.Arrays;

/**
 * @Author XiaoMing
 * @create 2020/4/4 8:43
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ints[0] = i;
                    ints[1] = j;
                    return ints;
                }
            }
        }
        throw new IllegalArgumentException("两数之和没有等于"+target);
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] ints = twoSum(arr, target);
        /**
         * 注意：
         * 此处System.out.println这个方法，默认调用的是对象的toString()方法的内容
         * 会打印出"[I@4554617c"
         * 如果要打印数组，用Arrays这个工具类
         */
        System.out.println(Arrays.toString(ints));
    }
}
