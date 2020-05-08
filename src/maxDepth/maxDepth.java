package maxDepth;

/**
 * @Author XiaoMing
 * @create 2020/5/5 15:28
 * 104. 二叉树的最大深度
 * (做二叉树：1.DFS(深度优先)，2.BFS(广度优先))
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class maxDepth {
    //深度优先DFS
    //1.左、右回什么（回树高）
    //2.这一步做什么（max（左，右）+ 1）
    //3.往上传什么
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left , right) +1 ; //加一是加上当前结点的深度
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        maxDepth maxDepth = new maxDepth();
        int i = maxDepth.maxDepth(treeNode);
        System.out.println(i);
    }
}
