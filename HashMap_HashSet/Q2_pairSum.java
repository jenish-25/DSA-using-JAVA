package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Q2_pairSum {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,6,8};
        int target=15;
        HashSet<Integer> st=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp=target-arr[i];
            if(st.contains(temp)){
                System.out.println(true);
                return;
            }
            st.add(arr[i]);
        }
        System.out.println(false);
    }
}
