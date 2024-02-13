package leetcode;

public class L1689_partitioningIntoMinNumOfDeciBinary {
    public static void main(String[] args) {
       String n = "27346209830709182346";
       int max=-1;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)-'0' > max){
                max=n.charAt(i)-'0';
            }
        }
        System.out.println(max);

    }
}
