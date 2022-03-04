import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:yym
 * @create:2021/4/26,20:03
 * @version:1.0
 */
public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        CreateTargetArray array = new CreateTargetArray();
        int[] targetArray = array.createTargetArray(nums, index);
        System.out.println(Arrays.toString(targetArray));

    }

    public int[] createTargetArray(int[] nums, int[] index) {

        /**
         *
         * add(int index, E element)接口：将element插入到特定的index位置上，并将任何元素向右移动
         *
         * Inserts the specified element at the specified position in this list
         * (optional operation).  Shifts the element currently at that position
         * (if any) and any subsequent elements to the right (adds one to their
         * indices).
         */

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;

        /* ↓ 错的 ↓ */
        /*int[] target = new int[nums.length];

        //记录上一次的值
        int old_num = 0;
        //记录上次角标
        int old_index = 0;

        for (int i = 0, j = 0; i < nums.length && j < index.length; i++, j++) {

            if (index[j] == old_index) {
                target[j] = old_num;
            }

            target[index[j]] = nums[i];

            old_num = target[index[j]];
            old_index = j;


            System.out.println("index " + index[j] + "+++" + nums[i] + "---" + Arrays.toString(target));
        }
        return target;*/
    }
}
