/**
 * @Author XiaoMing
 * @create 2020/4/19 10:42
 * 28. 实现 strStr()
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1。
 */
public class strStr {
    public int strStr(String haystack, String needle) {
        //needle长度
        int nlen = needle.length();
        //haystack长度
        int hlen = haystack.length();
        for(int i = 0 ; i <= hlen-nlen ; i++){
            //截取haystack中needle长度的字符串，与needle比较，相等返回i
            String substring = haystack.substring(i, i + nlen);
            if (substring.equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "bba";
        strStr strStr = new strStr();
        int i = strStr.strStr(haystack, needle);
        System.out.println(i);
    }
}
