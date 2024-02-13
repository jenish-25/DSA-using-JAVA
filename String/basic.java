package String;

public class basic {
    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer("jenish");
//        String s1=new String(sb);
//        System.out.println(s1);

        byte[] b={100,99,98};
        char[] c={'c','f','r'};
        String s4[]={"ad","ae"};
        String s="   jems";
        String s2="jenish";

        String se=s.trim();
        System.out.println(se);

        System.out.println(s2);
        System.out.println(s);

        System.out.println(s.isEmpty());
        String b1=new String(c);
        System.out.println(b1);

        String name=" ";
        if(name.trim().isEmpty()){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }

        String ch="c";
        String ch1="d";
        System.out.println(ch.compareToIgnoreCase(ch1));
    }
}
