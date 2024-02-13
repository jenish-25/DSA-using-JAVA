package leetcode;

import java.util.Arrays;

public class L922_SortBypariti2 {
    public static void main(String[] args) {
       int[] nums = {4,2,5,7};
       int[] ans=new int[nums.length];
       int freq[]=new int[1001];

        for(int i:nums)
        {
            freq[i]++;
        }
        int k=1;
        for(int i=1;i<1001;i+=2)
        {
            while(freq[i]!=0)
            {
                ans[k]=i;
                k+=2;
                freq[i]--;
            }
        }
        k=0;
        for(int i=0;i<1001;i+=2)
        {
            while(freq[i]!=0)
            {
                ans[k]=i;
                k+=2;
                freq[i]--;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
