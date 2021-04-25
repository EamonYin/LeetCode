import java.util.ArrayList;
import java.util.List;

/**
 * @author:yym
 * @create:2021/4/25,20:10
 * @version:1.0
 */
public class CountMatches {

    public static void main(String[] args) {
        ArrayList<String> children1 = new ArrayList<>();
        ArrayList<String> children2 = new ArrayList<>();
        ArrayList<String> children3 = new ArrayList<>();

        ArrayList<List<String>> lists = new ArrayList<>();

        children1.add("phone");
        children1.add("blue");
        children1.add("pixel");

        children2.add("computer");
        children2.add("silver");
        children2.add("lenovo");

        children3.add("phone");
        children3.add("gold");
        children3.add("iphone");

        lists.add(children1);
        lists.add(children2);
        lists.add(children3);

        String ruleKey = "type";
        String ruleValue = "phone";

        CountMatches cm = new CountMatches();
        int i = cm.countMatches(lists, ruleKey, ruleValue);
        System.out.println(i);

    }


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int i = 0;
        int sum = 0;

        for (List<String> ll : items) {

            //判断key
            switch (ruleKey) {
                case "type":
                    i = 0;
                    break;
                case "color":
                    i = 1;
                    break;
                default:
                    i = 2;
            }

            //根据key获得value
            String value = ll.get(i);

            if (ruleValue.equals(value)) {
                sum++;
            }

        }
        return sum;
    }
}
