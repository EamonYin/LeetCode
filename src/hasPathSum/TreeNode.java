package hasPathSum;

/**
 * @Author XiaoMing
 * @create 2020/5/1 16:56
 */
public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", val=" + val +
                '}';
    }

    TreeNode(int x) {
        val = x;
    }

}
