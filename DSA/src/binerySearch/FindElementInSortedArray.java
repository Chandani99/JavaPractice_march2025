package binerySearch;

public class FindElementInSortedArray {
    public int findElement(int arr[], int target){
        int left =0, right =arr.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindElementInSortedArray febsa = new FindElementInSortedArray();
         int arr[] = {1,3,5,7,8,10,12, 24};
         int target = 8;
        System.out.println(febsa.findElement(arr, target));
    }
}
