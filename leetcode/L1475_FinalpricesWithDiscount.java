package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class L1475_FinalpricesWithDiscount {
    public static void main(String[] args) {
//        int[] arr = {8,4,6,2,3};      //[4,2,4,2,3]
//        Stack<Integer> st=new Stack<>();
//        int n= arr.length;
//        int[] ans=new int[n];
//        ans[n-1]=arr[n-1];
//        st.push(arr[n-1]);            //peek==3
//        for(int i=n-2;i>=0;i--){
//            while(!st.isEmpty() && st.peek()>arr[i]){
//                st.pop();
//            }
//            if(st.isEmpty()){
//                ans[i]=arr[i];
//            }
//            else{
//                ans[i]=arr[i]-st.peek();
//            }
//            st.push(arr[i]);
//        }
//        System.out.println(Arrays.toString(ans));
        int prices[]={8,4,6,2,3};

        int[] arr = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            if(arr.length - 1 == i){
                arr[i] = prices[i];
                break;
            }
            for(int j= i + 1; j<prices.length; j++){
                if(prices[i] >= prices[j] ){
                    arr[i] = prices[i] - prices[j];
                    break;
                }
                else{
                    arr[i] = prices[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));    }
}
