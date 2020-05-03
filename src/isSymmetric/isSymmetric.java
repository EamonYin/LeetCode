package isSymmetric;

/**
 * @Author XiaoMing
 * @create 2020/5/3 20:12
 * 101. 对称二叉树(镜面对称)
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        boolean b = is(root, root);
        return b;
    }
    public boolean is(TreeNode t1 , TreeNode t2){
        if(t1 == null && t2 ==null) return true;
        if(t1 == null || t2 ==null) return false;
        return (t1.val == t2.val) && is(t1.left , t2.right) && is(t1.right,t2.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);

        isSymmetric is = new isSymmetric();
        boolean symmetric = is.isSymmetric(treeNode);
        System.out.println(symmetric);

    }
}
