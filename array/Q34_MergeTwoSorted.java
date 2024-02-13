package array;

import java.util.Arrays;

public class Q34_MergeTwoSorted {
    public static void main(String args[]){
        int arr1[]={1,2,3};
        int arr2[]={2,5,6};
        int arr3[]=new int[arr1.length + arr2.length];
        int left=0,right=0;
        int i=0;

        while(left<arr1.length && right< arr2.length){
            if(arr1[left] >arr2[right]){
                arr3[i]=arr2[right];
                right++;
                i++;
            }
            else{
                arr3[i]=arr1[left];
                left++;
                i++;
            }
        }
        while(left< arr1.length){
            arr3[i]=arr1[left];
            i++;
            left++;
        }
        while(right< arr2.length){
            arr3[i]=arr2[right];
            i++;
            right++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
