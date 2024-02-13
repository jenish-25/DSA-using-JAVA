package array;

public class Q31_FindExtraElement {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,4};
        int sum=0; int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int n=5;
        sum1=n*(n+1)/2;
        System.out.println(sum-sum1 + " is extra element");
    }
}
