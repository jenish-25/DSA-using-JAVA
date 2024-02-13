package leetcode;

public class L1539_kthSmallest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};   //{1,2,3,4,5,6,7,8,9,10,11}
        int k = 2;
        int size = arr.length;
        int low = 0;
        int high = size;
        while(high > low) {
            int mid = (high+low)/2;
            int miss = arr[mid]-1 - mid;
            if(k <= miss) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        System.out.println(high + k);
    }
}
