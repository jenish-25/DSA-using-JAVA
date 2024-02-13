package Recursion;

public class Q9_largestEle {
    public static void main(String[] args) {
        int[] arr={32,25,4,9,16};
        int n= arr.length;
        System.out.println("max ele is " + largest(arr,n));

    }
    public static int largest(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],largest(arr,n-1));
    }
}
