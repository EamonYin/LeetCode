package mergeTwoLists;

/**
 * @Author XiaoMing
 * @create 2020/4/16 8:17
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        mergeTwoLists mergeTwoLists = new mergeTwoLists();
        ListNode recursion = mergeTwoLists.mergeTwoLists(l1, l2);
        System.out.println("递归方式"+recursion);
        /**
         * 当与上面的recursion同时输出，会出现如下结果
         * 递归方式1 1 2 3 4 4
         * 非递归方式1 1 1 2 2 3 3 4 4 4 4
         * 结果时，非代码错误，是ListNode的toString（）的问题
         */
        ListNode nonrecursion = mergeTwoLists.mergeTwoLists2(l1, l2);
        System.out.println("非递归方式"+nonrecursion);
    }

    //递归方式
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //任何一个链表空，则递归终止
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        //选出两个链表中，头结点val最小的结点，用它的next指向其他结点的集合
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    //非递归方式
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        //头结点的前驱
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        //比较两个头节点，保存小的头节点，以此类推
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        //若两个链表长度不同，长链表剩下的结点存到head链表中
        if(l1 != null) head.next = l1;
        if(l2 != null) head.next = l2;
        return dummy.next;
    }
}
