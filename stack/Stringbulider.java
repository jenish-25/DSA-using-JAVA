package stack;

public class Stringbulider {
    public static void main(String[] args) {
//        String s="abbaca";
//        StringBuilder sb=new StringBuilder();
//        int n=0;
//        for(char c: s.toCharArray()){
//            if(n != 0  &&  c==sb.charAt(n-1)){
//                sb.deleteCharAt(n-1);
//                n-=1;
//            }
//            else{
//                sb.append(c);
//                n+=1;
//            }
//        }
//        System.out.println(sb.toString());

        StringBuffer fb=new StringBuffer();
        fb.append("hello");
        System.out.println(fb.capacity());
    }
}
