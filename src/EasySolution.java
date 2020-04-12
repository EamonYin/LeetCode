/**
 * @Author XiaoMing
 * @create 2020/4/12 12:29
 * 9. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class EasySolution {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(131);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;//负数一定不是回文数
        int cur = 0;
        int num = x;
        while (num != 0) { //将给定数字x倒置
            cur = cur * 10 + num % 10;
            num/=10;
        }
        return cur == x;//看倒置后是否和原数x相等
    }
}
