package array;

public class Q35_largestSumSubArray {                //kadane's algorithm
    public static void main(String args[]){
        int arr[]={1,4,-8,7,-6,9,-9};
        int currentSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>max){
                max=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println(max);
    }
}
