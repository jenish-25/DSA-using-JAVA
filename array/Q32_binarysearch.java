package array;
import java.util.Scanner;

public class Q32_binarysearch {

        public static void main(String args[]){     //O(log n)
            int arr[]={1,3,4,6,8,9};

            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur num");
            int value=sc.nextInt();
            int start=0; int end=arr.length-1;
            int mid=(start+end)/2;

            while(start<=end){
                if(arr[mid]==value){
                    System.out.println("ur index is : "+mid);
                    return;
                }
                else if(arr[mid]>value){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                mid=(start+end)/2;
            }

        }
}
