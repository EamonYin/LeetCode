package addTwoNumbers;

/**
 * @Author XiaoMing
 * @create 2020/4/4 16:33
 * 2. 两数相加
 * 公共类ListNode
 */
//每一个链表由多个节点组成
public class ListNode {
     /*为了方便，这两个变量都使用public，而不用private就不需要编写get、set方法了。
     存放数据的变量，简单点，直接为int型*/

    int val; //数据域
    ListNode next; //指针域

    //每一个Node类对象都必须保存有响应的数据
    ListNode(int x) {
        val = x; //this.val = x ;
    }

}
