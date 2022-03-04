/**
 * @author:yym
 * @create:2021/5/18,20:03
 * @version:1.0
 */
public class MinOperations {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 1};
        MinOperations mo = new MinOperations();
        int i = mo.minOperations(nums);
        System.out.println(i);
    }

    public int minOperations(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int front = nums[i];
            int next = nums[i + 1];
            while (front >= next) {
                next++;
                sum++;
            }
            nums[i + 1] = next;
        }
        return sum;
    }
}
