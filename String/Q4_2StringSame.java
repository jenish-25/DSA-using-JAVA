package String;

public class Q4_2StringSame {
    public static void main(String[] args) {
        String str1="hello";
        String str2="helloo";

        boolean ans=compare(str1,str2);
        System.out.println(ans ? "true" : "false");
    }
    public static int len(String s){
        int i=0;
        while(i<s.length()){
            i++;
        }
        return i;
    }
    public static boolean compare(String str1,String str2){
        if(len(str1) != len(str2)){
            return false;
        }
        int i=0;
        while(i<str1.length()){
            if(str1.charAt(i) != str2.charAt(i)){
                return  false;
            }
            i++;
        }
        return true;
    }
}
