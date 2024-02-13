package leetcode;

public class Q2259_RemoveNumToMaxResult {
    public static void main(String[] args) {
       String s = "5121";
       String digit = "1";
       String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == digit.charAt(0)){
                String t=s.substring(0,i)+s.substring(i+1);
                if(t.compareTo(ans)>0){
                    ans=t;
                }
            }
        }
        System.out.println(ans);
    }
}
