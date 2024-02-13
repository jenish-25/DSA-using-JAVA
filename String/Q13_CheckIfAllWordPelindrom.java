package String;

import java.util.Arrays;

public class Q13_CheckIfAllWordPelindrom {
    public static void main(String[] args) {
        String s="manam aka issi";
        String[] ch =s.split(" ");
        String news="";
        for(String i:ch){
            i=reverse(i);
            news+=i+" ";
        }
        news=news.trim();
        s=s.trim();
        if(s.equals(news)){
            System.out.println("its palindrome");
            return;
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static String reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
}
