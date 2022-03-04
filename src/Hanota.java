import java.util.ArrayList;
import java.util.List;

/**
 * @author:yym
 * @create:2021/4/13,20:50
 * @version:1.0
 * https://leetcode-cn.com/problems/hanota-lcci/
 * https://www.runoob.com/java/method-tower.html
 */
public class Hanota {

    public static void main(String[] args) {
        Hanota solution = new Hanota();
        List<Integer> int1 = new ArrayList<>();
        int1.add(2);
        int1.add(1);
        int1.add(0);
        List<Integer> int2 = new ArrayList<>();
        List<Integer> int3 = new ArrayList<>();
        solution.hanota(int1, int2, int3);
    }

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {

        method((A.size()), A, B, C);

    }

    public void method(int num, List<Integer> from, List<Integer> mid, List<Integer> to) {
        System.out.println("++" + num);
        if (num == 1) {
            //from中移除最后一个最大的块
            Integer remove = from.remove(from.size() - 1);
            //添加到to中
            to.add(remove);
            return;
        }
        //两个的时候 from[0] → mid[1] ; from[1] → to[1] ; mid[1] → to[0]
        //    -2-      -|-       -|-
        //   --1--    --|--     --|--
        //  ---0---  ---|---   ---|---
        //三个的时候 from[0] → mid[2] ; from[1] → to[2] ; to[2] → mid[1] ; from[2] → to[2] ; mid[1] → from[2] ; mid[2] → to[1] ; from[2] → to[0]

        //1. from 借助 to , 把除了“当前最大盘”移到mid上
        method((num - 1), from, to, mid);

        //2. 把 当前最大盘 放到最后to
        Integer nowMaxPlate = from.remove(from.size() - 1);
        to.add(nowMaxPlate);

        //3. mid 借助 from , 把除了盘子移到to上
        method((num - 1), mid, from, to);

    }
}
