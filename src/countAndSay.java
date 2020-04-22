/**
 * @Author XiaoMing
 * @create 2020/4/21 8:48
 * 38. 外观数列
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * <p>
 * 1.     1
 * 2.     11（上面的是1个1）
 * 3.     21（上面的是2个1）
 * 4.     1211（上面的是1个2，1个1）
 * 5.     111221（上面的是1个1，1个2，2个1）
 * 把括号里里面的个去掉就是后面的数
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * <p>
 * 注意：整数序列中的每一项将表示为一个字符串。
 * https://www.youtube.com/watch?v=Sc59O3bS4kk
 */
public class countAndSay {
    public static void main(String[] args) {
        countAndSay cas = new countAndSay();
        int n = 4;
        String s = cas.countAndSay(n);
        System.out.println(s);
    }

    public String countAndSay(int n) {
        int i = 1;
        String res = "1";
        while (i < n) {
            int count = 1;//数数
            char num = res.charAt(0);//要被数数的num
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j < res.length(); j++) {//不难理解，就是遍历整个res
                if (j != res.length() && res.charAt(j) == num) {//当第J个字符和第0个字符相等，就数数
                    count++;
                } else {
                    stringBuilder.append(count);//几个num
                    stringBuilder.append(num);//count个num
                    if (j != res.length()) {//res没有遍历完，但是遇到新的num了，count从1重新开始数
                        count = 1;
                        num = res.charAt(j);
                    }
                }
            }
            stringBuilder.append(count);//将第一个if语句中的count，append进来
            stringBuilder.append(num);//将第一个if语句中的num，append进来
            res = stringBuilder.toString();
            i++;
        }
        return res;
    }
}
