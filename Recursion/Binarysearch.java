package Recursion;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={1,4,5,8,9,11};
        int n= arr.length;
        int i=0,j=n-1;
        int key=4;
        System.out.println(Bsearch(arr,i,j,key));
    }
    private static int Bsearch(int[] arr, int i, int j, int key) {
        if(i>j) return -1;

        int mid=i+(j-i)/2;

        if(arr[mid]==key) return mid;
        if(arr[mid]<key){
            return Bsearch(arr,mid+1,j,key);
        }
        else return Bsearch(arr,i,mid-1,key);
    }
}
