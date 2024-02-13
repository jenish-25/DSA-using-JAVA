package leetcode;

import java.util.Arrays;

public class L1647_minDeletToMakeFreqUnique {
    public static void main(String[] args) {
       String s = "ceabaacb";
       int arr[]=new int[26];
       int used[]=new int[s.length()+1];
       for(char c:s.toCharArray()){
           int x=c-'a';
           arr[x]++;
       }
       int count=0;
       for(int i: arr){
           while(i>0 && used[i]>0){
               i--;
               count++;
           }
           if(i>0) used[i]=1;
       }
        System.out.println(count);
    }
}
