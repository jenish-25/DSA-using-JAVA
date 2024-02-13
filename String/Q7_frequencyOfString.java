package String;

public class Q7_frequencyOfString {
    public static void main(String[] args) {
        String s="jenish vavadiya";
        int arr[]=new int[128];
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            arr[ascii]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println((char) i + " " + arr[i]);
            }
        }
    }
}
