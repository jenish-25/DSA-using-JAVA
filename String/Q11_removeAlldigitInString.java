package String;


public class Q11_removeAlldigitInString {
    public static void main(String[] args) {
//        String s="he2llo9";
//        String newS="";
//        for(int i=0;i<s.length();i++){
//            int ascci=s.charAt(i);
//            if(ascci>48 && ascci<=57){
//                continue;
//            }
//            newS+=s.charAt(i);
//        }
//        System.out.println(newS.trim());

        String s="hde2llo259";
        String newS="";
        for(int i=0;i<s.length();i++){
//            int ascci=s.charAt(i);
            if(s.charAt(i)>='1' && s.charAt(i)<='9'){
                continue;
            }
            newS+=s.charAt(i);
        }
        System.out.println(newS.trim());
    }

}
