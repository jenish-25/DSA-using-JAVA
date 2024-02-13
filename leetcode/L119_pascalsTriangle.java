package leetcode;

import java.util.ArrayList;

public class L119_pascalsTriangle {
    public static void main(String[] args) {
       int rowIndex = 3;  //[1,3,3,1]

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        if(rowIndex == 0){
            System.out.println(list);
            return;
        }
        for(int i=1;i<=rowIndex;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }

            }
            list=row;
        }
        System.out.println(list);
    }
}
