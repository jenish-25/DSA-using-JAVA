package leetcode;

import java.util.HashSet;

public class L1832_StringPanagram {
    public static void main(String[] args) {
//       String s = "thequickbrownfoxjumpsoverthelazydog";
       String s = "leetcode";

        HashSet<Character> st=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
        if(st.size()==26){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
