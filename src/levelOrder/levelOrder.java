package levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author XiaoMing
 * @create 2020/5/7 17:16
 * 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();//存放每一层的节点
            for(int i = 0 ; i < size ; i++){
                TreeNode poll = queue.poll();
                level.add(poll.val);//将队列pop出来的节点，存到list中
                if(poll.left != null) queue.add(poll.left);//将左孩子add到队列中
                if(poll.right != null) queue.add(poll.right);//将有孩子add到队列中
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        levelOrder order = new levelOrder();
        List<List<Integer>> lists = order.levelOrder(treeNode);
        System.out.println(lists);
    }
}
