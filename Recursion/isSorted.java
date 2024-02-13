package Recursion;

public class isSorted {
    public static void main(String[] args) {
        int[] arr={2,4,1,24,35};
        int n= arr.length;
        boolean ans=checkSorted(arr,n,1);
        if(ans){
            System.out.println(true);
        }
        else System.out.println(false);
    }
    private static boolean checkSorted(int[] arr, int n,int idx) {
        if (n <= 1) {
            return true;
        }
        if(idx==n){
            return true;
        }
        if(arr[idx-1]>arr[idx]){
            return false;
        }
        return checkSorted(arr, n, idx+1);
    }
    }
