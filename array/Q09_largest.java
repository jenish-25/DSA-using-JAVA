package array;

public class Q09_largest {
    public static void main(String args[]){       //o(n)
        int arr[]={-18,-2,-8,-6,-14};
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        System.out.println(max1);
    }
}
