package array;

public class Q27_PairWithSum {
        public static void main(String[] args) {
            int[] arr={1,5,7,5};
            int sum=6;
            int left=0,right= arr.length-1;
            while(left<right){
                int pair=arr[left]+arr[right];
                if (pair == sum)
                {
                    System.out.println("["+ arr[left] + " , " + arr[right]+ "]");
                    left++;
                    right--;
                }
                else if (pair > sum)
                {
                    right--;
                }
                else if (pair < sum)
                {
                    left++;
                }
            }
        }
}
