package array;

public class Q15_twotime {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int arr2[]=new int[arr.length*2];
        int count=0;
        int count2=1;

        for(int i=0;i< arr.length;i++){
            arr2[count]=arr[i];
            arr2[count2]=arr[i];
            System.out.print(arr2[count]+" ");
            System.out.print(arr2[count2]+" ");
            count+=2;
            count2+=2;
            }
        }
    }