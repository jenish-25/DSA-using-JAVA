package array;

public class Q36_DeleteSorted {
    static void delet(int arr[],int element){
        for(int i=0;i< arr.length;i++){
            if(element == arr[i]){
                for(int j=i;j< arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        delet(arr,5);

    }
}
