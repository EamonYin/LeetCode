/**
 * @author:yym
 * @create:2021/4/13,19:47
 * @version:1.0
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c :
                s.toCharArray()) {
            if(c==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace space = new ReplaceSpace();
        String s = space.replaceSpace("We are happy.");
        System.out.println(s);
    }
}
