package array;

import java.util.Arrays;

public class Sort_Bubble {
    public static void main(String[] args) {
        int arr[]={13,43,24,51,9,20};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
