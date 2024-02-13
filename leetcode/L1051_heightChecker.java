package leetcode;

public class L1051_heightChecker {
    public static void main(String[] args) {
       int Heights[] = {1,1,4,2,1,3};
       int res=0;
       int curHeight=0;
       int[] freq=new int[101];
       for(int height: Heights){
           freq[height]++;
       }
       for(int i=0;i<Heights.length;i++){
           while(freq[curHeight]==0){
               curHeight++;
           }
           if(curHeight != Heights[i]){
               res++;
           }
           freq[curHeight]--;
       }
        System.out.println(res);
    }
}
