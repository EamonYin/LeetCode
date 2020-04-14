/**
 * @Author XiaoMing
 * @create 2020/4/14 9:42
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String prefix = strs[0];
        //遍历字符串
        for (int i = 1; i < strs.length; i++) {
            //取第一个字符串比对后面的字符串
            int j;
            for(j = 0 ; j < prefix.length() && j < strs[i].length() ; j++){
                //第一个字符串的第j项 和 第i个字符串的第j项 对比，获得最长前缀
                if(prefix.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            //保存相同的部分
            prefix = prefix.substring(0,j);
            if(prefix.equals("")) return prefix;
        }
        return prefix;
    }

    public static void main(String[] args) {
          String[] strs = {"flower","flight","flow"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
}
