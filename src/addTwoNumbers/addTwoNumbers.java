package addTwoNumbers;

/**
 * @Author XiaoMing
 * @create 2020/4/4 16:17
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class addTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode p = l1, q = l2, curr = sum;
        int carry = 0;//进位
        while(p != null || q != null) {
            //解决 Operator'' cannot be applied to 'int'， 'addTwoNumbers. ListNode
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int numsum = carry + x + y;
            carry = numsum / 10;//获取进位的值
            curr.next = new ListNode(numsum % 10);//取模运算，把个位数字存到链表sum中
            curr = curr.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;

        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return sum.next;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode21 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        ListNode listNode23 = new ListNode(4);
        listNode21.next = listNode22;
        listNode22.next = listNode23;

        ListNode sum = addTwoNumbers(listNode1, listNode21);
        while (sum != null){
            System.out.print(sum.val);
            sum = sum.next;
            System.out.print("->");
        }
    }

}
