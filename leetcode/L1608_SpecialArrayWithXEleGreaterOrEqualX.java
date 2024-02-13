package leetcode;

public class L1608_SpecialArrayWithXEleGreaterOrEqualX {
    public static void main(String[] args) {
       int[] nums = {3,6,7,7,0};
        int x = nums.length;
        int[] counts = new int[x+1];

        for(int elem : nums)
            if(elem >= x)
                counts[x]++;
            else
                counts[elem]++;

        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i)
                System.out.println(i);
        }
        }
}
