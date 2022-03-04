import java.util.Arrays;

/**
 * @author:yym
 * @create:2021/4/29,20:14
 * @version:1.0
 * 贪心思想，每一个点移动到下一个点的时间，由其横纵坐标中较大的决定
 * 切比雪夫距离
 */
public class MinTimeToVisitAllPoints {
    public static void main(String[] args) {
        int[][] nums = {{1, 1}, {3, 4}, {-1, 0}};
        MinTimeToVisitAllPoints mttva = new MinTimeToVisitAllPoints();
        int i = mttva.minTimeToVisitAllPoints(nums);
        System.out.println(i);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int size = points.length;
        for (int i = 1; i < size; ++i) {
            /**
             * X轴
             * i=1  X轴:Math.abs(3 - 1)  例：二维数组第 1 组中的第 0 个数是 3
             * i=2  X轴:Math.abs(-1 - 3)
             */
            int xMinus = Math.abs(points[i][0] - points[i - 1][0]);
            /**
             * Y轴
             * i=1  Y轴:Math.abs(4 - 1)
             * i=2  Y轴:Math.abs(0 - 4)
             */
            int yMinus = Math.abs(points[i][1] - points[i - 1][1]);
            res += Math.max(xMinus, yMinus);
        }
        return res;

    }
}
