package String;

public class Q14_CheckStringHaveEqualNumWithChar {
    public static void main(String[] args) {
        String s="jen25is5h312";
        int count=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii>48 && ascii<=57){
                count++;
            }
        }
        if(n-count==count){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
