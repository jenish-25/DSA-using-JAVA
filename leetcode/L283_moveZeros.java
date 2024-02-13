package leetcode;

import java.util.Arrays;

public class L283_moveZeros {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
//        int m=0;
//        for(int  i=0;i<arr.length;i++){
//            if(arr[i] ==0){
//                m++;
//            }
//            else if(m!=0){
//                arr[i-m]=arr[i];
//                arr[i]=0;
//            }
//        }
        int j=0;
        for(int i=0;i<arr.length;i++){      //time==>O(n)   space==>O(1)
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(;j< arr.length;j++){
            arr[j]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
