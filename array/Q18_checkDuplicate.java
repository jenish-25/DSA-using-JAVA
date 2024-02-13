package array;

import java.util.Scanner;

public class Q18_checkDuplicate {
    public static void main(String args[]){
        int arr[]={1,2,3,2,4,5};
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        if(count>1){
            System.out.println(n + " is duplicate");
        }
        else{
            System.out.println(n + " is not duplicate");
        }
    }
}
