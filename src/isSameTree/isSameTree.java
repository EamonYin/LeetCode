package isSameTree;

/**
 * @Author XiaoMing
 * @create 2020/5/1 16:55
 * 100. 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //左右孩子都为空
        if (p == null && q == null) return true;
        //左右孩子有一个为空
        if(p == null || q == null) return false;
        //左右孩子不相等
        if( p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
     TreeNode treeNode = new TreeNode(1);
     treeNode.left = new TreeNode(2);
     treeNode.right = new TreeNode(3);

     TreeNode treeNode2 = new TreeNode(1);
     treeNode2.left = new TreeNode(2);
     treeNode2.right = new TreeNode(3);

     isSameTree is = new isSameTree();
     boolean sameTree = is.isSameTree(treeNode, treeNode2);
     System.out.println(sameTree);
    }
}
