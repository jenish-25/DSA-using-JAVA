package leetcode;

import java.util.ArrayList;

public class L728_SelfDividingNum {
    public static void main(String[] args) {
     int   left = 9, right = 22;
    ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=left; i<=right; i++){
            if(checkNumber(i)){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
    public static boolean checkNumber(int num){
        int temp = num;
        while(temp != 0){
            int remainder = temp%10;
            if(remainder == 0 || num%remainder != 0){
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
