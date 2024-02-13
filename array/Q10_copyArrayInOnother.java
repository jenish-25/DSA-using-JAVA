package array;
import java.util.Arrays;
public class Q10_copyArrayInOnother {
    public static void main(String args[]){
       int arr1[]={1,2,3,4,5};
       int arr2[]=new int[arr1.length];

//        System.out.println("array 1 is ");
//       for(int i=0;i<arr1.length;i++){
//           System.out.print(arr1[i]+ " ");
//       }
        System.out.println("array 1 is \n" + Arrays.toString(arr1));
        System.out.println("\narray 2 is ");
//       for(int i=0;i<arr1.length;i++){
//           arr2=arr1;
//           System.out.print(arr2[i]+ " ");
//       }
        arr2=arr1;
        System.out.println(Arrays.toString(arr2));
    }
}
