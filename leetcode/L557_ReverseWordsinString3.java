package leetcode;

public class L557_ReverseWordsinString3 {
    public static void main(String[] args) {
       String s = "Let's take LeetCode contest";
       String newS[]=s.split(" ");
       String s1="";

       for(int i=0;i<newS.length;i++){
           s1=s1+reverseSt(newS[i]);
           s1=s1+" ";
       }
        System.out.println(s1.trim());
    }
    private static String reverseSt(String newS) {
        StringBuilder sb=new StringBuilder();
        return String.valueOf(sb.append(newS).reverse());
    }
}
