package array;

import java.util.Arrays;

public class Sort_insertion {
    public static void main(String[] args) {
//        int arr[]={9,12,5,10,14,3,10};
//        int n= arr.length;
//        for(int i=1;i<n;i++){
//            int temp=arr[i];
//            int j=i-1;
//            for(;j>=0 && arr[j]>temp;j--){
//                arr[j+1]=arr[j];
//            }
//            arr[j+1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

        int arr[]={9,12,5,10,14,3,11};
        int n= arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            for(int j=i;j>0;j--){
                if(temp< arr[j-1]){
                    int x=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=x;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
