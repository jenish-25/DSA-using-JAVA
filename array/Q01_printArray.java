package array;

public class Q01_printArray {
        public static void main(String args[]){
            int arr[]={1,2,3,4,5,20};
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            System.out.println("sum of array is "+ sum);
        }
    }
