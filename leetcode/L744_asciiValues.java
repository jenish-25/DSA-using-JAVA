package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class L744_asciiValues {
    public static void main(String[] args) {
//        int ch='a';
//        char ch1='b';
////        int ascii=ch;
//        System.out.println(ch);

//        Scanner sc=new Scanner(System.in);
//        char ch=sc.next().charAt(0);
//        int ascii=ch;
//        System.out.println( ch +" "+ ascii);

        char letters[]={'c','f'};
        int ascii[]=new int[letters.length];
        char target='d';
        int v=target;
        for(int i=0;i<letters.length;i++) {
            ascii[i] = letters[i];
        }
        for(int i=0;i< ascii.length;i++){
            if(ascii[i]>v){
                System.out.println( (char)ascii[i] +" ");
                return;
            }
           if(v>ascii[ascii.length-1]){
               System.out.println(letters[0]+" ");
               return;
           }
        }
    }
}
