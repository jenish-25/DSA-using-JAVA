package String;

public class Q9_reverseWordsInternally {


    public static void main(String[] args) {
        String s="olleh woh era uoy";
        String newS="";

        String[] arr=s.split(" ");
        for(String i: arr){
            i = reverse(i);
            newS += i + " ";
        }
        System.out.println(newS.trim());
    }
    public static String reverse(String s){
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2+= s.charAt(i);
        }
        return s2;
    }
}
