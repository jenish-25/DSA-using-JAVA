package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,11};
        int n= arr.length;
        int key=9;
        if(linearSearchCode(arr,n,0,key)==-1){
            System.out.println(false);
        }
        else System.out.println(true);
    }
    private static int linearSearchCode(int[] arr, int n,int idx, int key) {
        if(idx==n){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
         return  linearSearchCode(arr , n,idx+1, key);
        }
    }

