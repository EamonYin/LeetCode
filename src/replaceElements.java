import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author:yym
 * @create:2021/5/27,20:08
 * @version:1.0
 */
public class replaceElements {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements r = new replaceElements();
        int[] ints = r.replaceElements2(arr);
        System.out.println(Arrays.toString(ints));
    }

    //方法一：有个用例超时了！
    public int[] replaceElements(int[] arr) {
        //下标为x
        for (int i = 0; i < arr.length - 1; i++) {
            int max = temp(arr, i + 1);
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    //挑剩下数组最大值
    public int temp(int[] arr, int index) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = index; i < arr.length; i++) {
            integers.add(arr[i]);
        }
        Integer max = Collections.max(integers);
        return max;
    }

    //方法二：从右向左遍历
    public int[] replaceElements2(int[] arr) {
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            if (temp > rightMax) {
                rightMax = temp;
            }
        }
        return arr;
    }
}
