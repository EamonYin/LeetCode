import java.util.Arrays;

/**
 * @author:yym
 * @create:2021/4/24,18:06
 * @version:1.0
 */
public class XorOperation {
    public static void main(String[] args) {
        XorOperation xo = new XorOperation();
        int i = xo.xorOperation(1, 7);
        System.out.println(i);
    }

    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int num = 0;
        for (int j = 0; j < n; j++) {
            num = num ^ nums[j];
        }
        return num;
    }
}
