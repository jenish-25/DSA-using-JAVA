package leetcode;

import java.util.Stack;

public class L682_BaseballGame {
    public static void main(String[] args) {
      String[] ops = {"-60","D","-36","30","13","C","C","-33","53","79"};
        int arr[]=new int[ops.length];
        int j=0;
        for(int i=0;i<ops.length;i++){
            if(ops[i]=="C"){
                arr[j-1]=0;
                j--;
            }
            else if(ops[i]=="D"){
                arr[j]=arr[j-1]*2;
                j++;
            }
            else if(ops[i]=="+"){
                arr[j]=arr[j-1]+arr[j-2];
                j++;
            }
            else{
                arr[j]=Integer.parseInt(ops[i]);
                j++;
            }
        }
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
