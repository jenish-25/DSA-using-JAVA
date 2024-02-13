package String;

public class TwoStringPermutation {
    public static void main(String[] args) {
        String s1="aaaa";
        String s2="bbbb";
        int arr[]=new int[128];

        for(int i=0; i<s1.length(); i++){
            arr[(int)s1.charAt(i)]++;
            arr[(int)s2.charAt(i)]++;
        }

        for(int i: arr){
            if(i % 2!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
