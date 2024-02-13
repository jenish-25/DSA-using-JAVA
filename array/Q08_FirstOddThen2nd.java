package array;

//import java.util.Arrays;

public class Q08_FirstOddThen2nd {
        public static void main(String args[]){
            int arr[]={1,2,3,4,5,6,7,8,9,10};
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                if(arr[start]%2==1){
                    start++;
                }
                else if(arr[end]%2==0){
                    end--;
                }
                else{
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }


        }

    }
