package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10_findDuplicate {
    public static void main(String[] args) {
        String s="akaasshh";
        int arr[]=new int[128];
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            arr[ascii]++;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=2){
                System.out.println((char)i+ " "+arr[i]);
            }
        }
    }
}
