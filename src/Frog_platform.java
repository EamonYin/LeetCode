/**
 * @author:yym
 * @create:2021/4/7,20:21
 * @version:1.0 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class Frog_platform {
    public int numWay(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Frog_platform frog_platform = new Frog_platform();
        int method = frog_platform.numWay(10);
        System.out.println(method);
    }
}
