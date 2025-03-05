package twoPointers;

public class MergeTwoSortedArrays {

    public int[] mergedElemants(int[] arr1, int[] arr2){
        int left = 0, right = 0;
        int index =0;
        int []result = new int[arr1.length + arr2.length];
        System.out.println(result.length
        );
        while(left<arr1.length && right< arr2.length ){
           if(arr1[left] < arr2[right]){
               result[index] = arr1[left];
               left++;
               index++;
           }else if(arr2[right] < arr1[left]) {
               result[index] = arr2[right];
               right++;
               index++;
           }else{
               result[index] = arr1[left];
               index++;
               result[index] = arr2[right];
               index++;
               left++;
               right++;
           }
        }
//        If some element left in arr1
        while(left<arr1.length){
            result[index] = arr1[left];
            left++;
            index++;
        }
//        if some elements left in arr2
        while(right < arr2.length ){
            result[index] = arr2[right];
            right++;
            index++;
        }
        return result;
    }


}
