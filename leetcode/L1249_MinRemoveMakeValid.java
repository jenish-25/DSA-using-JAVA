package leetcode;

import java.util.Stack;

public class L1249_MinRemoveMakeValid {
    public static void main(String[] args) {
      String  s = "lee(t(c)o)de)";
//      String  s = "a)b(c)d";
        char[] arr = s.toCharArray();
        int open = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                open++;
            else if (arr[i] == ')') {
                if (open == 0)
                    arr[i] = '*';
                else
                    open--;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (open > 0 && arr[i] == '(') {
                arr[i] = '*';
                open--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                arr[p++] = arr[i];
        }
        System.out.println(new String(arr).substring(0,p));
    }
}
