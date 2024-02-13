package leetcode;

public class leetcodeTry {
    public static void main(String[] args) {
      int[]  arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        int freq[]=new int[1001];
        for(int i:arr1){
            freq[i]++;
        }
        int res[]=new int[arr1.length];
        int j=0;
        for(int n:arr2){
            while(freq[n]>0){
                res[j]=n;
                freq[n]--;
                j++;
            }
        }
        for(int k=0;k<freq.length;k++){
            while(freq[k]>0){
                res[j]=k;
                freq[k]--;
                j++;
            }
        }
        System.out.println(res);
    }
}