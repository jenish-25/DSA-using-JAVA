package leetcode;

public class L2869_MinOpeToCollectItems {
    public static void main(String[] args) {
      int[]  nums = {1,2,2};
      int k = 2;
      int t=k;
        int count=0;
        int occ[]=new int[k+1];
        for(int i=1;i<occ.length;i++){
            occ[i]++;
        }
        int j=nums.length-1;
        while(j>=0){
            if(nums[j]<=k) {
                int pop = nums[j];
                if(occ[pop]!=0) {
                    occ[pop]--;
                    t--;
                }

            }
            count++;
            j--;
            if(t==0) break;
        }
        System.out.println(count);
    }
}
