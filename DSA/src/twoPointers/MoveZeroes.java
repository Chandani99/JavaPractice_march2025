package twoPointers;

import java.util.Arrays;

public class MoveZeroes {

    public int[] moveZerosAtLast(int arr[]){
        int left = 0,  right = arr.length-1;

        while(left < right){
            if(arr[left] != 0){
                left++;
            }else if(arr[right] == 0){
                right--;
            }else{
                arr[left] = arr[right];
                arr[right] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {0,2,4,0,8,4,9,0,0,0,0,6};
        MoveZeroes moveZeroes = new MoveZeroes();
        int []result = moveZeroes.moveZerosAtLast(arr);
        System.out.println(Arrays.toString(result));
    }
}
