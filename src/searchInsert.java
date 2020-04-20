/**
 * @Author XiaoMing
 * @create 2020/4/20 8:36
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class searchInsert {
   public int searchInsert(int[] nums, int target) {
        int low = 0;
        //区间长度？[low , nums.length) [low , nums.length-1]
       //[2,2] = 1 ; [2,2) = 0
        int height = nums.length -1 ;
        while(low <= height){
            int mid = (low+height)/2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid]){
                height = mid -1 ;
                System.out.println("target < nums[mid]=>"+" low="+low+" height="+height+" mid="+mid);
            }
            else{
//                System.out.println(mid);
                low = mid +1 ;
                System.out.println("target > nums[mid]=>"+" low="+low+" height="+height+" mid="+mid);
            }
        }
        return low;
   }

    public static void main(String[] args) {
       int[] nums = {1,3,5,6};
       int target = 2;
        searchInsert searchInsert = new searchInsert();
        int i = searchInsert.searchInsert(nums, target);
        System.out.println(i);
    }
}
