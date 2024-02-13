package array;

public class Q36_InsertSorted {
    static void insert(int arr[],int p,int element){
        for(int i= arr.length-1;i>p-1;i--){
            arr[i]=arr[i-1];
        }
        arr[p-1]=element;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int p;
        int element;
        insert(arr,5,10);

    }
}
