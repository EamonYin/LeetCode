/**
 * @author:yym
 * @create:2021/4/8,20:38
 * @version:1.0 剑指 Offer 10- I. 斐波那契数列
 */
public class Fibonacci {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int fib = fibonacci.fib(1);
        System.out.println(fib);
    }
}
