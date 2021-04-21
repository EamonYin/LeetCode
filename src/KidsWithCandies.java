import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author:yym
 * @create:2021/4/21,19:52
 * @version:1.0
 */
public class KidsWithCandies {
    public static void main(String[] args) {
        KidsWithCandies kids = new KidsWithCandies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> booleans = kids.kidsWithCandies(candies, extraCandies);
        System.out.println(booleans);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Integer> nums = new ArrayList<>();

        ArrayList<Boolean> booleans = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            nums.add(candies[i]);
        }
        //加上额外值最大的数字
        Integer max = Collections.max(nums);

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }
        return booleans;
    }
}
