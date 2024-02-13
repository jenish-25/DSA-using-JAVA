package String;

public class swap2string {
    public static void main(String[] args) {
        String s1="jenish";
        String s2="cemil";
        char ch[]=s1.toCharArray();
        s1=s2;
        s2=String.valueOf(ch);
        System.out.println(s1);
        System.out.println(s2);
    }
}
