package leetcode;

public class L1108_definingIPAddress {
    public static void main(String[] args) {
      String[] operations = {"--X","X--","X--"};
      int X=0;
        for(int i=0; i<operations.length; i++) {
            String curr = operations[i];
            if(curr.indexOf('+') != -1) {
                X++;
            } else {
                X--;
            }
        }
        System.out.println(X);

    }
}
