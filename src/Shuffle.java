import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author:yym
 * @create:2021/4/22,19:48
 * @version:1.0
 */
public class Shuffle {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = 3;
        Shuffle s = new Shuffle();

        int[] shuffle = s.shuffle(nums, n);
        System.out.print(Arrays.toString(shuffle));

    }

    public int[] shuffle(int[] nums, int n) {

        int[] nu = new int[nums.length];

        for (int i = 0, j = n; i < n && j < 2 * n; i++, j++) {

            nu[2 * i] = nums[i];
            nu[2 * i + 1] = nums[j];

        }
        return nu;
    }
}
