package leetcode;

import java.util.Arrays;

public class L1299_ReplaceELeGreatestEle {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
            else{
                arr[i]=max;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
