import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author:yym
 * @create:2021/4/28,20:10
 * @version:1.0
 */
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        SmallerNumbersThanCurrent sntc = new SmallerNumbersThanCurrent();
        int[] ints = sntc.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ints));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sum = 0;

//        ArrayList<Integer> integers = new ArrayList<>();

        int[] res = new int[nums.length];
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    sum++;
                }
            }
//            integers.add(sum);
            res[temp++] = sum;
            sum = 0;
        }

        return res;
    }
}
