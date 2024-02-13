package String;

import java.util.Arrays;

public class extra {
    public static void main(String[] args) {
        String s="i.like.you.very";
        String[] ch =s.split(".");
        int left=0;
        int right=ch.length-1;
        while(left<right){
            String temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            right--;
            left++;
        }
        s=new String(Arrays.toString(ch));
        System.out.println(s);
    }
}
