package array;

import java.util.Scanner;

public class Q29_RotateByDpositions {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int ans[]=new int[arr.length];

        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur D position");
        int d=sc.nextInt();
        if(d> arr.length){
            d=d % arr.length;
        }
        int k=0;
        for(int i=d;i< arr.length;i++){
            ans[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            ans[k]=arr[i];
            k++;
        }
//        for(int i=0;i< arr.length;i++){
//            arr[i]=ans[i];
//        }
        for(int i=0;i< arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
