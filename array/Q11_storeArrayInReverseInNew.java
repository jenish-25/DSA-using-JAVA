package array;

import java.util.Arrays;

public class Q11_storeArrayInReverseInNew {         //o(n)
        public static void main(String[] args) {
          int arr1[]={1,2,3,4,5,6};
          int arr2[]=new int[arr1.length];

          int n=arr1.length-1;
          for(int i=0;i<arr1.length;i++){
              arr2[n]=arr1[i];
              n--;
          }
//          for(int i=0;i<arr2.length;i++){
//              System.out.print(arr2[i]+" ");
//          }
            System.out.print("array 2 is "+ Arrays.toString(arr2));

          //other method

//            int i=arr1.length-1;
//            int count=0;
//            while(i>=0)
//            {
//                arr2[count]=arr1[i];
//                i--;
//                System.out.print(arr2[count] + " ");
//                count++;
//            }
        }
}
