/**
 * @Author XiaoMing
 * @create 2020/4/18 16:11
 * 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class removeElement {
    public int removeElement(int[] nums, int val) {
        //慢指针遍历，快指针查val
        int len = nums.length;
        int i = 0;
        for(int j = 0 ; j < len ; j++){
            //快指针遇到不是val的，就替换
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement removeElement = new removeElement();
        int i = removeElement.removeElement(nums, 2);
        System.out.println(i);
    }
}
