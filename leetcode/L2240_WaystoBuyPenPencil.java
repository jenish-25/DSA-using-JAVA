package leetcode;

public class L2240_WaystoBuyPenPencil {
    public static void main(String[] args) {
       int total = 20, cost1 = 10, cost2 = 5;
        int min = Math.min(cost1,cost2);
        int max = Math.max(cost1,cost2);
        long ways = 0;
        for(int i = 0; i <= total; i += max){
            int rem = total - i;
            ways += rem/min + 1;
        }
        System.out.println(ways);
    }
}
