package array;

import java.util.Arrays;

public class sort_counting {
    public static void main(String[] args) {
        int arr[]={5,7,4,8,4,3,1};
//         find max
//        int max=Integer.MIN_VALUE;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
////        counting sort (not stable)
//
//        int count[]= new int[max+1];
//
//         for(int i=0;i< count.length;i++){
//             count[arr[i]]++;
//         }
//         int k=0;
//         for(int i=0;i< count.length;i++){
//             for(int j=0;j< count[i];j++){
//                 arr[k]=i;
//                 k++;
//             }
//         }
        System.out.println(Arrays.toString(arr));
        countSort(arr);
    }
    static void countSort(int a[]){
        int n=a.length;

        int output[]=new int[n];
        int max=Integer.MIN_VALUE;
        //max
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        //frequency array
        int count[]= new int[max+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        //prefix sum array
        for(int i=1;i< count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[a[i]]-1;
            output[idx]=a[i];
            count[a[i]]--;
        }
        for(int i=0;i<n;i++){
            a[i]=output[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
