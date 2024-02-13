package leetcode;

import java.util.HashSet;

public class L2367_numOfArithmeticTriplets {
    public static void main(String[] args) {
       int[] nums = {0,1,4,6,7,10};
       int diff = 3;
//       int i=0;
//       int j=1;
//       int k=2;
//       int count=0;
//       while(i< nums.length-2){
//           while(j< nums.length-1 && nums[j]-nums[i]<diff){
//               j++;
//           }
//           if(j== nums.length-1) break;
//           if(nums[j]-nums[i]>diff){
//               i++;
//               continue;
//           }
//           k=Math.max(k,j+1);
//           while(k< nums.length && nums[k]-nums[j]<diff){
//               k++;
//           }
//           if(k== nums.length) break;
//           if(nums[k]-nums[j]>diff){
//               i++;
//               j++;
//               continue;
//           }
//           count++;
//           i++;
//           j++;
//           k++;
//       }
//        System.out.println(count);

        HashSet<Integer> st=new HashSet<>();
        int count=0;
        for (int i=0;i< nums.length;i++) {
            if(st.contains(nums[i]-diff) && st.contains(nums[i]-2*diff)){
                count++;
            }
            st.add(nums[i]);
        }
        System.out.println(count);
    }
}
