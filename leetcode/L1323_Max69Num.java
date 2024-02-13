package leetcode;

public class L1323_Max69Num {
    public static void main(String[] args) {
      int  num = 6666;
        String str = Integer.toString(num);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '6') {
                charArray[i] = '9';
                System.out.println(Integer.parseInt(String.valueOf(charArray)));
                return;
            }
        }
        System.out.println(num);
    }
}
