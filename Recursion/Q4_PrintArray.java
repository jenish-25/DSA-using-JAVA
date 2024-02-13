package Recursion;

public class Q4_PrintArray {
    public static void main(String[] args) {
        int[] arr={2,14,53,71,1};
        int n= arr.length-1;
        ArrPrint(arr,n);
    }
    public static void ArrPrint(int[] arr,int n){
        if(n==0){
            System.out.print(arr[n]+ " ");
            return;
        }
//        System.out.print(arr[n]+" ");    //reverse array print
//        ArrPrint(arr,n-1);
        System.out.print(arr[n]+" ");    //array print
        ArrPrint(arr,n-1);

    }
}
