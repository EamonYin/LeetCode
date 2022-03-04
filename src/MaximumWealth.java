import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:yym
 * @create:2021/4/19,20:47
 * @version:1.0
 */
public class MaximumWealth {
    public static void main(String[] args) {
        MaximumWealth mw = new MaximumWealth();
        int[][] personMoney = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int max = mw.maximumWealth(personMoney);
        System.out.println("存款最多的人的存款 → "+max);
    }

    public int maximumWealth(int[][] accounts) {

        int sum = 0;

        ArrayList<Integer> objects = new ArrayList<>();

        //外循环遍历有多少个一维数组
        for (int i = 0; i < accounts.length; i++) {
            //内循环遍历每一个一维数组的元素
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            objects.add(sum);
            sum = 0;
        }
        Integer max = Collections.max(objects);
        return max;
    }
}
