package array;

import java.util.Arrays;

public class Q16_arr3Alternate {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};
        int arr3[]=new int[arr.length*2];
        int j=0,i;
        for(i=0;i<arr.length;i++){
            arr3[j]=arr[i];
            j++;
            arr3[j]=arr2[i];
            j++;
        }
        for(i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
