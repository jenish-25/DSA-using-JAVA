package Recursion;

public class checkStringIsPalindrom {
    public static void main(String[] args) {
        String s="amaa";
        System.out.println(Palindrom(0,s));
    }
    private static boolean Palindrom(int i,String s) {
        if(i>= s.length()/2){
            return true;
        }
        if(s.charAt(i)!= s.charAt(s.length()-i-1)) return false;
        return Palindrom(i+1,s);
    }
}
