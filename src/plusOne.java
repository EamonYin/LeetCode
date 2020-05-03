import java.util.Arrays;

/**
 * @Author XiaoMing
 * @create 2020/4/25 17:26
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class plusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1 ; i >= 0 ; i--){
            digits[i] = digits[i] + 1;
            digits[i] = digits[i]%10;
            if(digits[i] !=0 ) return digits;
        }
        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[]  nums = {8,9,9,9};
        plusOne po = new plusOne();
        int[] ints = po.plusOne(nums);
        System.out.println(Arrays.toString(ints));
    }
}
