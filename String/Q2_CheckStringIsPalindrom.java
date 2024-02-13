package String;

public class Q2_CheckStringIsPalindrom {
    public static void main(String[] args) {
        String s="hello";
        char[] ch=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            right--;
            left++;
        }
        String newS=new String(ch);
        if(newS.equals(s)){
            System.out.println("palindrome");
            return;
        }
        System.out.println("not palindrome");
    }
}
