package leetcode;

import java.util.HashMap;

public class L1497_ArrayPairsAreDivisibleByK {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,10,6,7,8,9};
       int k = 5;
        HashMap<Integer,Integer> hm=new HashMap<>();
        if(arr.length%2!=0){
            System.out.println(false);
            return;
        }
        for(int i=0;i< arr.length;i++){
            int mod=arr[i]%k;
            if(mod<0){
                mod+=k;
            }
            hm.put(mod,hm.getOrDefault(i,0)+1);
        }
        for(int j: hm.keySet()){
             int val=hm.get(j);
             if((j==0 && val%2!=0) || (k%2==0 && j*2==k && val%2!=0)){
                System.out.println(false);
                return;
             }
             else if(j != 0 && j*2 !=k){
                 int diff=k-j;
                 if(!hm.containsKey(diff) || !hm.get(diff).equals(hm.getOrDefault(j,0))){
                     System.out.println(false);
                     return;
                 }
            }
        }
        System.out.println(true);
    }
}
