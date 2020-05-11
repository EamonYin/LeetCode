package sortedArrayToBST;

/**
 * @Author XiaoMing
 * @create 2020/5/11 8:25
 * <p>
 * 108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class sortedArrayToBST {
    int nums[];

    public static void main(String[] args) {
        int nums[] = {-10, -3, 0, 5, 9};
        sortedArrayToBST satb = new sortedArrayToBST();
        TreeNode treeNode = satb.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }

    public TreeNode helper(int left, int right) {
        //如果 left > right，子树中不存在元素，返回空。
        if (left > right) return null;
        //找出中间元素
        int mid = (left + right) / 2;
        //创建根节点：
        TreeNode treeNode = new TreeNode(nums[mid]);
        //递归创建左子树
        treeNode.left = helper(left, mid - 1);
        //递归创建右子树
        treeNode.right = helper(mid + 1, right);

        return treeNode;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }

}
