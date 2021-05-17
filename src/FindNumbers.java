/**
 * @author:yym
 * @create:2021/5/17,20:06
 * @version:1.0
 */
public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        FindNumbers numbers = new FindNumbers();
        int num = numbers.findNumbers(nums);
        System.out.println(num);
    }

    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if (length % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}
