package array;

public class Q30_MissingElement{
    public static void main(String args[]){
        int arr[]={1,2,3,5,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int n=6;
        int sum1=n*(n+1)/2;
        System.out.println(sum1-sum + " is missing");
    }
}
