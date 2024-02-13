package leetcode;

public class L1442_countTripletsCanFormOfXorArray {
    public static void main(String[] args) {
       int[] a = {2,3,1,6,7};
        int l = a.length;
        int ans = 0;
        for(int i = 0; i < l; i++)
        {
            int k = a[i];
            for(int j = i + 1; j < l; j++)
            {
                k = k ^ a[j];
                if(k == 0)
                    ans += j - i;
            }
        }

    }
}
