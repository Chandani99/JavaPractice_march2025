package twoPointers;

public class TwoSumInSortedArray {

    public boolean sumExist(int[] nums, int target){
        int left = 0,  right = nums.length-1;
        while(left<right){
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                System.out.println("Position in array: "+left+" , "+right+" Elements are: "+nums[left]+" , "+nums[right]);
                return true;
            }
        }
        return false;
    }
}
