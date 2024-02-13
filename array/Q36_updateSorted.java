package array;

public class Q36_updateSorted {
    static void update(int arr[],int old,int newV){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==old){
                arr[i]=newV;
                return;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        update(arr,3,10);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
