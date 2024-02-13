package leetcode;

public class L908_smallestRange1 {
    public static void main(String[] args) {
        int nums[]={1,3,6};
        int k=1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        if(nums.length == 1){
            System.out.println(0);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }

            if(nums[i] < min){
                min = nums[i];
            }
        }

        if((max - min) <= (2*k)){
//            return 0;
            System.out.println(0);
        }

//        return ((max - min) - (2*k));
        System.out.println((max-min)-(2*k));
    }
}
