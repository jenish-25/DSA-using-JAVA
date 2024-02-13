package leetcode;

public class L1486_XOR {
    public static void main(String[] args) {
        int n=4;
        int start=3;
       int i=0;
       int ans=0;
       for(int j=0;j<n;j++){
           ans^=(start+(2*i));
           i++;
       }
        System.out.println(ans);
    }
}
