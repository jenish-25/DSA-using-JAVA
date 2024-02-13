package String;

public class StringToIntWithoutParseInt {
    public static void main(String[] args) {
        String s="12358";
        int x=0;
        for(int i=0;i<s.length();i++){
            x= (x*10)+s.charAt(i)-'0';
        }
        System.out.println(x);
    }
}
