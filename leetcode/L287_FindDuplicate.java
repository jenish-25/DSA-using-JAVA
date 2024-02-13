package leetcode;

public class L287_FindDuplicate {
    public static void main(String[] args) {
        int arr[]={2,2,2,2,2};

        boolean[] list = new boolean[arr.length];
        for(int num : arr){
            if(list[num]) {
                System.out.println(num);
                return;
            }
            list[num] = true;
        }
        System.out.println("-1");
    }
}
