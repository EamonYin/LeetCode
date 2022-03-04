import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:yym
 * @create:2021/5/19,20:15
 * @version:1.0
 */
public class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        LargestAltitude altitude = new LargestAltitude();
        int i = altitude.largestAltitude(gain);
        System.out.println(i);
    }

    public int largestAltitude(int[] gain) {
        int[] gains = new int[gain.length + 1];
        gains[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            gains[i + 1] = gain[i] + gains[i];
        }
        return Arrays.stream(gains).max().getAsInt();
    }
}
