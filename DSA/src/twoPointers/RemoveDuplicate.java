package twoPointers;

import java.util.Arrays;

public class RemoveDuplicate {

    public int[] removeDuplicateFromArray(int[]arr){
//        int []arr2 = {1,3,5,5,7,8,8,10,12,12, 24};
        int[] result = new int[arr.length];

        int i=0;
//        storing first element in result array coz the first element will always be unique
        result[0] = arr[0];
        System.out.println("result[0] "+result[0]);
        for(int j = 1; j<arr.length; j++){
            if(arr[j] != result[i]){
                result[++i] = arr[j];
                System.out.println("i: "+i+" , j: "+j);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int []nums = {1,3,5,5,7,8,8,10,12,12,24};
        RemoveDuplicate removeDuplicate= new RemoveDuplicate();
        int[] finalArray = removeDuplicate.removeDuplicateFromArray(nums);
        System.out.println(Arrays.toString(finalArray));
    }
}
