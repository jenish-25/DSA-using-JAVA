package array;

import java.util.Scanner;

public class Q29_Rotate_withoutExtraPlace {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;
//        int d=8;

        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int d1=d% arr.length;
        leftRotate(arr,n,d1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
     static void leftRotate(int[] arr, int n, int d1) {
        if(n==0){
            return;
        }
//            d=d%n;
         reverse(arr,0,d1-1);
         reverse(arr,d1,n-1);
         reverse(arr,0,n-1);
    }
}
