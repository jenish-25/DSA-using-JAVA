package leetcode;

import java.util.HashSet;

public class L804_uniqueMorseWord {
    static String s[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static void main(String[] args) {

      String[] words = {"gin","zen","gig","msg"};
        HashSet <String> st=new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            words[i]=convert(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            st.add(words[i]);
        }
        System.out.println(st.size());
    }
    public static String convert(String x){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            int t=x.charAt(i)-'a';
            sb.append(s[t]);
        }
        return sb.toString();
    }
}
