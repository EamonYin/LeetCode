package isBalanced;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 */

public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = healper(root.left);
        int right = healper(root.right);
        if( Math.abs(left - right) > 1 ) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 返回树的高度
     * @param tree
     * @return
     */
    public int healper(TreeNode tree){
        if(tree == null) return 0;
        return 1 + Math.max(healper(tree.left),healper(tree.right));
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        isBalanced ib = new isBalanced();
        boolean balanced = ib.isBalanced(treeNode);
        System.out.println(balanced);
    }
}
