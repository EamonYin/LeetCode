/**
 * @author:yym
 * @create:2022/3/3,21:44
 * @version:1.0 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class climbStairs {
    public static int fb(int n) {
        if (n < 2) {
            return 1;
        }
        int prev = 1;
        int current = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = current + prev;
            prev = current;
            current = res;
        }
        return res;
    }

    public static int dp(int n) {
        int res = 1;
        if (n < 2) {
            return res;
        } else {
            res = dp(n - 1) + dp(n - 2);
            return res;
        }
    }

    public static int dg(int n) {
        int res = 1;
        if (n < 2) {
            return res;
        } else {
            res = dg(n - 1) + 1;
            return res;
        }
    }

    public static void main(String[] args) {
//        System.out.println(fb(2));
        System.out.println(dp(45));
//        System.out.println(dg(5));

    }
}
