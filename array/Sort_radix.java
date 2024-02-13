package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_radix {
    public static void main(String[] args) {
        int arr[]={23,8,69,854,21,45};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void radixSort(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        for(int pos=1;max/pos>0;pos*=10){
            countSort(arr,pos);
        }
    }
    public static void countSort(int[] arr,int pos){
            int n=arr.length;

            int output[]=new int[n];
            //frequency array
            int count[]= new int[10];
            for(int i=0;i<n;i++){
                count[(arr[i]/pos)%10]++;
            }
            //prefix sum array
            for(int i=1;i< count.length;i++){
                count[i]+=count[i-1];
            }
            //find the element in the original array and put it in output array
            for(int i=n-1;i>=0;i--){
                int idx=count[(arr[i]/pos)%10]-1;
                output[idx]=arr[i];
                count[(arr[i]/pos)%10]--;
            }
            //copy all elements to output array
            for(int i=0;i<n;i++){
                arr[i]=output[i];
            }
    }
}
