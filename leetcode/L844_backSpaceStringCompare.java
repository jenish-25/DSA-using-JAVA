package leetcode;

public class L844_backSpaceStringCompare {
    public static void main(String[] args) {
      String s = "ab#c";
      String t = "ad#c";
        int i=s.length()-1;
        int j=t.length()-1;

        int Scount=0;
        int Tcount=0;

        while(true){
            while(i>=0){
                if(s.charAt(i) == '#'){
                    Scount++;
                    i--;
                }
                else if(Scount>0){
                    Scount--;
                    i--;
                }
                else{
                    break;
                }
            }
            while(j>=0){
                if(t.charAt(j) == '#'){
                    Tcount++;
                    j--;
                }
                else if(Tcount>0){
                    Tcount--;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i>=0 && j>=0){
                if(s.charAt(i) == t.charAt(j)){
                    i--;
                    j--;
                }
                else {
                    System.out.println(false);
                    return;
                }
            }
            else{
                break;
            }
        }
        if(i==j){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
