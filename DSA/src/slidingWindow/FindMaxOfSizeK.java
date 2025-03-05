package slidingWindow;

public class FindMaxOfSizeK {
    public int maxSumOfWindowK(int arr[], int k){
        int maxSum = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum>maxSum){
            maxSum = sum;
        }
        for(int j = k; j<arr.length; j++){
            sum =(sum+arr[j])- arr[j-k];
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,5,6,1,7,8,4,9,10,0,-1};
        int k = 3;
        FindMaxOfSizeK findMaxOfSizeK = new FindMaxOfSizeK();
        System.out.println(findMaxOfSizeK.maxSumOfWindowK(arr, k));
    }
}
