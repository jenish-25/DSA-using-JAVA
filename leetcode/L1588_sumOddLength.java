package leetcode;

public class L1588_sumOddLength {
    public static void main(String[] args) {
       int[] arr = {2,5,3,1,4};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int left=i+1;
            int right=arr.length-i;
            int total=left * right;
            int odd=0;
            if(total%2==0){
                odd=total/2;
            }
            else{
                odd=(total/2)+1;
            }
            ans += odd * arr[i];
        }
        System.out.println(ans);
    }
}
