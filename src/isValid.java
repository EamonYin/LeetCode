import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Author XiaoMing
 * @create 2020/4/15 12:13
 * 20. 有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class isValid {

    public boolean isValid(String s) {

        if(s == null || s.length() == 0)return true;

        HashMap<Character, Character> val = new HashMap<>();
        val.put(')', '(');
        val.put(']', '[');
        val.put('}', '{');
        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char bracket  = s.charAt(i);
            for(char bracket : s.toCharArray()) {
                //将左括号存入stack中
                if (bracket == '(' || bracket == '[' || bracket == '{') {
                    stack.push(bracket);
                }
                //用右侧括号对比栈顶的左括号是否匹配
                else {
                    //pop出的栈顶元素（即左侧括号）与map中右侧括号不配对
                    if (stack.size() == 0 || val.get(bracket) != stack.pop()) return false;
                }
            }
//        }
        //栈中存放的是左括号，若pop空，则说明字符串中的所有括号都能匹配
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        isValid isValid = new isValid();
        boolean valid = isValid.isValid("{[]}");
        System.out.println(valid);
    }
}
