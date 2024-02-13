package condition;

public class swap {
        public static void main(String []args) {
            int i = 12, j = 23;
            int x;

            System.out.println("before swap: ");
            System.out.println("the value of i " + i);
            System.out.println("the value of j " + j);

            x = i;
            i = j;
            j = x;

            System.out.println("after swap: ");
            System.out.println("the value of i : " + i);
            System.out.println("the value of j : " + j);
        }
}
