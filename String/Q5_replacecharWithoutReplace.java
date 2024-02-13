package String;

public class Q5_replacecharWithoutReplace {
    public static void main(String[] args) {
        String s1="helle";

       char ch[]=s1.toCharArray();
       for(int i=0;i<ch.length;i++){
           if(ch[i]=='e'){
               ch[i]='o';
           }
       }
       s1=new String(ch);
        System.out.println(s1);
    }
}
