package String;

public class Q1_reverseString {
    public static void main(String[] args) {
        //using char array
//        String s="hello";
//        String newS="";
//       char[] ch=s.toCharArray();
//       for(int i=s.length()-1;i>=0;i--){
//           newS=newS+s.charAt(i);
//       }
////       s=newS;
//        System.out.println(newS);

        //using string to reduce space

        String s="hello";
        char ch[]=s.toCharArray();
        int left=0,end=s.length()-1;
        while(left<end){
            char temp=ch[left];
            ch[left]=ch[end];
            ch[end]= temp;
            left++;
            end--;
        }
//        s=new String(ch);
        System.out.println(ch);
    }
}
