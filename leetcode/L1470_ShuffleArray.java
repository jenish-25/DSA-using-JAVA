package leetcode;

import java.util.Arrays;

public class L1470_ShuffleArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        //output==> {1,5,2,6,3,7,4,8}
        int  n=4;
        int start=0;
        int end=n;
        int ans[]=new int[arr.length];
        int cont=0;
        int cont1=1;
//        while(cont<arr.length){
//            ans[cont]=arr[start];
//            cont+=2;
//            start++;
//        }
//        while(cont1<arr.length){
//            ans[cont1]=arr[end];
//            cont1+=2;
//            end++;
//        }
        while(cont<arr.length && cont1<arr.length){
            ans[cont]=arr[start];
            ans[cont1]=arr[end];
            cont+=2;
            cont1+=2;
            start++;
            end++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
