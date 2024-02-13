package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Q1_ArrayIsSubsetOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,8,7,4};
        int arr2[]={1,2,7};
        HashSet<Integer> st=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!st.contains(arr[i])){
                st.add(arr[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!st.contains(arr2[i])){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

    }
}
