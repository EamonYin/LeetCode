/**
 * @author:yym
 * @create:2021/4/9,20:09
 * @version:1.0
 */
public class Tibonacci {
    public int tribonacci(int n) {

        if(n == 0){
            return 0;
        }

        int[] dp = new int[n + 2];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < n + 2; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Tibonacci tib = new Tibonacci();
        int tribonacci = tib.tribonacci(0);
        System.out.println(tribonacci);
    }
}
