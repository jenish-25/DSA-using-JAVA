package leetcode;

public class L2169_countOpeToObtainZero {
    public static void main(String[] args) {
        int num1=10,num2=10;
        int count=0;
        while(num1>0 && num2>0) {
            if (num1 > num2) {
                num1 = num1 - num2;
                count++;
            } else if (num2 > num1) {
                num2 = num2 - num1;
                count++;
            }
            else if(num1==num2){
                num1=num1-num2;
                count++;
            }
        }
        System.out.println(count);
    }
}
