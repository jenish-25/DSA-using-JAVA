package leetcode;

public class L1963_MinSwapToMakeStringBalanced {
    public static void main(String[] args) {
       String s = "]]][[[";
        int l=0;
        int r=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                l++;
            }
            else r++;
            if(r>l){
                count++;
                l++;
                r--;
            }
        }
        System.out.println(count);
    }
}
