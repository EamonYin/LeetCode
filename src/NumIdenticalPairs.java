/**
 * @author:yym
 * @create:2021/4/20,20:05
 * @version:1.0
 */
public class NumIdenticalPairs {
    public static void main(String[] args) {
        NumIdenticalPairs nip = new NumIdenticalPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int i = nip.numIdenticalPairs(nums);
        System.out.println("一共" + i);
    }

    public int numIdenticalPairs(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    total++;
                }
            }
        }
        return total;
    }
}
