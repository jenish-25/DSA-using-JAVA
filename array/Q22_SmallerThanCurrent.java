package array;

import java.util.Scanner;

public class Q22_SmallerThanCurrent {
    public static void main(String args[]){
        int arr[]={2,5,4,8,6};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter you arrays size");
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("enter array element");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int countnum[]=new int[arr.length];

        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]>arr[j] && (i!=j)){
                    count++;
                }
            }
            countnum[i]=count;
        }
        for (int i=0;i< countnum.length;i++){
            System.out.print(countnum[i]+" ");
        }
    }
}
