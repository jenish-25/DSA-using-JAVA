package String;

import java.util.Arrays;

public class Q3_countWord {
    public static void main(String[] args) {

        //with  split func

        String s="a\nhjp fo";
        String[] s1=s.split("\\s+");
        System.out.println(s1.length);

        //without split func

//        String s="hello\nhow are you";
//        int count=1;
//        for(int i=0;i<s.length();i++){
//            if((s.charAt(i) == ' ') || (s.charAt(i) == '\n')){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
