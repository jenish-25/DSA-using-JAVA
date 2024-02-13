package String;

public class Q4_2StringWithEqualsFunc {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello ";
        s1=s1.trim();
        s2=s2.trim();
        if(s1.equals(s2)){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
