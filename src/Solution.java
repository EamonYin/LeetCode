import java.util.HashSet;

/**
 * @Author XiaoMing
 * @create 2020/4/8 10:12
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution {
    //1.暴力法，LeetCode超时
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for (int i = 0 ; i < s.length() ; i++){
            for (int j = i+1 ; j <= s.length() ; j++) {
                     if(Repeat(s,i,j)){
                         ans = Math.max(ans , j-i);//挑选不含有重复字符的最长子串的长度
                     }
            }
        }
        return ans;
    }

    /**
     * 判断字符串中的字符是否有重复
     * 有重复返回true；无重复返回false
     */
    public static boolean Repeat (String s , int start , int end){
        HashSet<Character> chars = new HashSet<>();
        for (int i = start ; i < end ; i++){
            char c = s.charAt(i);
            if(chars.contains(c)) return false;
            chars.add(c);
        }
        return true;
    }

    //2.滑动窗口（队列）

    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
