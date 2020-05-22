package minDepth;

/**
 * @author:YiMing
 * @create:2020/5/22,18:00
 * @version:1.0 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class minDepth {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        //左右子树，有一边不为空，则此时root非叶子节点，向下查找最大值
        if(root.left == null || root.right == null)
            return 1 + Math.max(minDepth(root.left) , minDepth(root.right));
        //左右子树都为空了，则取最小值
            return 1 + Math.min(minDepth(root.left) , minDepth(root.right));

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        minDepth minDepth = new minDepth();
        int i = minDepth.minDepth(treeNode);
        System.out.println(i);

    }
}
