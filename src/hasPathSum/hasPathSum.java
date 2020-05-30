package hasPathSum;

/**
 * @author:YiMing
 * @create:2020/5/30,18:06
 * @version:1.0
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class hasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        sum -= root.val;
          if ((root.left == null) && (root.right == null))
            return (sum == 0);
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(2);
        treeNode.left.left.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.right = new TreeNode(1);

        hasPathSum hasPathSum = new hasPathSum();
        boolean b = hasPathSum.hasPathSum(treeNode, 22);
        System.out.println(b);
    }
}
