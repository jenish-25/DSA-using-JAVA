package array;

public class Q23_2ndLargest {
    public static void main(String args[]){
            int arr[]={71,13,30,51,17,19};
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max1){
                    int temp=arr[i];
                    max2=max1;
                    max1=temp;
                }
                else if(arr[i]>max2){
                    max2=arr[i];
                }
            }
            System.out.println(max1);
            System.out.println(max2);
        }
    }
