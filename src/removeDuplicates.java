/**
 * @Author XiaoMing
 * @create 2020/4/17 8:18
 *26. 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
          //删除重复元素
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[i] != nums[j]) {
                i++;
                //后面的元素前移
                nums[i] = nums[j];
            }
        }
        //删除后的新数组
        return i+1;
    }

    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        int[] arr = {1,1,2};
        int i = rd.removeDuplicates(arr);
        System.out.println(i);

    }
}
