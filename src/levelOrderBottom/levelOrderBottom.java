package levelOrderBottom;

import levelOrderBottom.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author XiaoMing
 * @create 2020/5/6 12:40
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 */
public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();//每一层有几个节点
            List<Integer> level = new ArrayList<>();//用于存放每一层的节点
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                level.add(poll.val);//将队列pop出来的节点，存到list中
                if (poll.left != null) queue.add(poll.left);//将左孩子add到队列中
                if (poll.right != null) queue.add(poll.right);//将有孩子add到队列中
            }
            //指定每一层的集合都加在 0 这个位置，保证最后一层在最前面
            result.add(0,level);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        /*TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);*/
        levelOrderBottom order = new levelOrderBottom();
        List<List<Integer>> lists = order.levelOrderBottom(treeNode);
        System.out.println(lists);
    }
}
