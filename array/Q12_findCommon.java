package array;

import java.util.Arrays;

public class Q12_findCommon {
    public static void main(String args[]){
        int arr1[]={10,4,2,5,6,3,9};
        int arr2[]={1,2,4,6};

        System.out.println("array 1 is "+ Arrays.toString(arr1));
        System.out.println("array 2 is "+ Arrays.toString(arr2));
        System.out.println("common element is ");

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+ " ");
                }
            }
        }
    }
}
