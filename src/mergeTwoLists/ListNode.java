package mergeTwoLists;

/**
 * @Author XiaoMing
 * @create 2020/4/16 8:18
 */
public class ListNode {
    ListNode next;
    int val;

    //构造方法
    ListNode(int x) {
        val = x;
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }

    @Override
    public String toString() {
        ListNode head = this ;
        //一旦通过stringBuilder生成了最终想要的字符串，就可以调用它的toString()方法将其转换为一个String对象。
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null){
            stringBuilder.append(head.val + " ");
            head = head.next;
        }
        return stringBuilder.toString();
    }
}
