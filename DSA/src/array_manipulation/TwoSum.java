package array_manipulation;

import java.util.*;

public class TwoSum {

//    approach 1 brutforce

    public static int[] printTwoPostion(int[] nums, int target){
        System.out.println("Brut Force approach=========================");
        int result[] = new int[2];

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++)
            if(nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                return result;
            }

        }
        return result;
    }

//    Otpimise Approact using Map

    public static int[] twoSum(int[] nums, int target) {
        System.out.println("Optimised approach=========================");

        int result[] = new int[2];
        Map<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remaining = target - nums[i];
            if(hm.containsKey(remaining)){
                result[0] = hm.get(remaining);
                result[1] = i;
                return result;
            }
            hm.put(nums[i], i);
        }
        throw new IllegalArgumentException("Answer not found");
    }


//    Main method

    public static void main(String[] args) {

        List<int[]> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(
                new int[]{2,7,11,15},
                new int[]{3,2,4},
                new int[]{3,3})
        );

        int [] target = {9, 6, 6};
        for(int i= 0; i<arrayList.size(); i++){
            System.out.println(printTwoPostion(arrayList.get(i), target[i]));
        }
    }

}
