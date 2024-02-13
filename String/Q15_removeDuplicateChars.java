package String;

public class Q15_removeDuplicateChars {
    public static void main(String[] args) {
        String s="hello    akaassh";
        String newS="";
        int[] arr=new int[128];
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            arr[ascii]++;
        }
        for(int i=0;i< s.length();i++){
            int ascii=s.charAt(i);
            if(arr[ascii]>=1){
                newS+=(char)ascii;
                arr[ascii]=0;
            }
        }
        System.out.println(newS);
    }
}
