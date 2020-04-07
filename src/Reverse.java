/**
 * @Author XiaoMing
 * @create 2020/4/7 11:24
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Reverse {

    public static int reverse(int x) {
        //int类型能存放10位的数字，最大为2147483647；
        int rev = 0;

            while (x != 0) {
                int old = rev;//记录上一次循环的rev
                System.out.println("----"+rev+"~~~~~"+Integer.MAX_VALUE);
                rev = rev * 10 + x % 10;//得到个位翻10倍累加下一次的个位，形成倒序
                System.out.println("rev" + rev);
                x = x / 10;//去除个位后
                if(rev/10 != old) return 0;
            }
        return rev;
    }

     public static void main(String[] args) {
        int num = 1534236469;
        int reverse = reverse(num);
        System.out.println("原数字：" + num);
        System.out.println("倒叙后：" + reverse);
    }
}
