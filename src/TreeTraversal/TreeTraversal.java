package TreeTraversal;

import java.util.List;


/**
 * @Author XiaoMing
 * @create 2020/5/9 8:40
 *
 * 【不是leetcode题】
 * 树的前序遍历，中序遍历，后序遍历
 *
 *     前序遍历：ABCDEFGHK
 *
 *     中序遍历：BDCAEHGKF
 *
 *     后序遍历：DCBHKGFEA
 */
public class TreeTraversal {
    //前序遍历
    public void PreorderTraversal(TreeNode root){
        System.out.print(root.val);
        TreeNode left = root.left;
        if(left != null) PreorderTraversal(left);
        TreeNode right = root.right;
        if(right != null) PreorderTraversal(right);
    }
    //中序遍历
    public void InOrdertraversal(TreeNode root){
        if ( root == null ) return;
        else{
            InOrdertraversal(root.left);
            System.out.println(root.val);
            InOrdertraversal(root.right);
        }
    }
    //后序遍历
  /*  public List<String> PostOrdertraversal(TreeNode root){

    }*/

    public static void main(String[] args) {

        TreeTraversal treeTraversal = new TreeTraversal();

        //构建树
        TreeNode treeNode = new TreeNode("A");
        treeNode.left = new TreeNode("B");
        treeNode.left.right = new TreeNode("C");
        treeNode.left.right.left = new TreeNode("D");
        treeNode.right = new TreeNode("E");
        treeNode.right.right = new TreeNode("F");
        treeNode.right.right.left = new TreeNode("G");
        treeNode.right.right.left.left = new TreeNode("H");
        treeNode.right.right.left.right = new TreeNode("K");

        //前序遍历
//        System.out.print("前序遍历：");
//        treeTraversal.PreorderTraversal(treeNode);
        //中序遍历
        System.out.print("中序遍历：");
        treeTraversal.InOrdertraversal(treeNode);
        //后序遍历

    }
}
