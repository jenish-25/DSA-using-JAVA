package leetcode;

public class L1342_numOfStepsReduceNumZero {
    public static void main(String[] args) {
        int num=14;
                int count=0;
                while(num>0){
                    if(num%2==0){
                        num/=2;
                        count++;
                    }
                    else if(num%2==1){
                        num=num-1;
                        count++;
                    }
                }
        System.out.println(count);
            }
}
