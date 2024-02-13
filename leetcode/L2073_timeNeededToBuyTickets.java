package leetcode;

public class L2073_timeNeededToBuyTickets {
    public static void main(String[] args) {
       int[] tickets = {2,3,2};
        int k = 2;
        int count=0;
        for (int i = 0; i < tickets.length; i++) {
            if(i<=k){
                count= count+ Math.min(tickets[k],tickets[i]);
            }
            else{
                count= count+ Math.min(tickets[k]-1,tickets[i]);
            }
        }
        System.out.println(count);
    }
}
