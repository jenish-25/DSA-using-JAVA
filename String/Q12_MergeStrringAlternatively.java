package String;

public class Q12_MergeStrringAlternatively {
    public static void main(String[] args) {
        String s1="jems";
        String s2="vavadiya";

        String news="";
        int j=0;
        int i=0;
        for(;i<s1.length() && i<s2.length();i++){
            news+=s1.charAt(i);
            news+=s2.charAt(j);
            j++;
        }
        while(i<s1.length()){
            news+=s1.charAt(i);
            i++;
        }
        while(j<s2.length()){
            news+=s2.charAt(j);
            j++;
        }
        System.out.println(news);
    }
}
