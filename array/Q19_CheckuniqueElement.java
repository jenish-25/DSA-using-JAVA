package array;

import java.util.Scanner;

public class Q19_CheckuniqueElement {
    public static void main(String args[]){             //o(n)
        int arr[]={1,4,4,1,8,2,8};
//        int v=4;
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==v){
                if(flag==true){
                    System.out.println("not unique");
                    return;
                }
                else{
                    flag=true;
                }
            }
        }
        System.out.println("unique");

    }
}
