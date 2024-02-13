package leetcode;

import java.util.Arrays;

public class L4_medianOf2SortedArrays {
    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        int left=0,right=0;
        int n=nums1.length+nums2.length;
        int ans[]=new int[n];
        int i=0;
        int count=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]>nums2[right]){
                ans[i]=nums2[right];
                right++;
                i++;
            }
            else{
                ans[i]=nums1[left];
                left++;
                i++;
            }
            count++;
        }
        while(left<nums1.length){
            ans[i]=nums1[left];
            left++;
            i++;
            count++;
        }
        while(right<nums2.length){
            ans[i]=nums2[right];
            right++;
            i++;
            count++;
        }
        if(n%2==0){
            System.out.println((float) (ans[n/2-1]+ans[n/2])/2);
        }
        else{
            System.out.println(ans[n/2]);
        }
        System.out.println(count);
        }
    }

