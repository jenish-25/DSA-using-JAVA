package leetcode;

public class L121_StockBuyAndSell {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int minvalue=prices[0];
        int maxprofit=0;
         for(int i=1;i< prices.length;i++){
           minvalue=Math.min(minvalue,prices[i]);
           int profit=prices[i]-minvalue;
           maxprofit=Math.max(maxprofit,profit);
        }
        System.out.println(maxprofit);
    }
}
