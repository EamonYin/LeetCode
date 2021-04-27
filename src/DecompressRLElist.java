import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author:yym
 * @create:2021/4/27,19:59
 * @version:1.0
 */
public class DecompressRLElist {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        DecompressRLElist dr = new DecompressRLElist();
        int[] ints = dr.decompressRLElist(nums);
        System.out.println(Arrays.toString(ints));
    }

    public int[] decompressRLElist(int[] nums) {

        int freq = 0;
        int val = 0;

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; 2 * i < nums.length; i++) {

            freq = nums[2 * i];
            val = nums[2 * i + 1];

            for (int j = 0; j < freq; j++) {
                integers.add(val);
            }
        }

        int[] ret = new int[integers.size()];

        for (int z = 0; z < integers.size(); z++) {
            ret[z] = integers.get(z);
        }

        return ret;
    }
}
