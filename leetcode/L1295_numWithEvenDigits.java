package leetcode;

public class L1295_numWithEvenDigits {
    public static void main(String[] args) {
        int nums[]={555,901,482,1771};
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]!=0){
                nums[i]/=10;
                count++;
            }

            if(count%2==0){
//                System.out.println(count);
                  max++;
            }
        }
        System.out.println(max);
    }
}
