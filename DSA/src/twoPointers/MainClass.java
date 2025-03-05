package twoPointers;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int []arr1 = {2,4,6,8,9};
        int []arr2 = {1,3,5,7,8,10,12, 24};
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int []result = mergeTwoSortedArrays.mergedElemants(arr1, arr2);
        System.out.println(Arrays.toString(result));

//        twosum==================

       TwoSumInSortedArray twoSumInSortedArray = new TwoSumInSortedArray();
        System.out.println(twoSumInSortedArray.sumExist(arr2, 12));

//        Remove duplicate============

    }
}
