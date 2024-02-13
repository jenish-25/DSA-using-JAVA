package leetcode;

public class L1598_crawlerLogFolder {
    public static void main(String[] args) {
      String[] logs = {"d1/","d2/","../","d21/","./"};
        int count=0;
        for(int i=0;i<logs.length;i++){
            if(!logs[i].equals("./") && !logs[i].equals("../")){
                count++;
            }
            else if(logs[i].equals("./")){continue;}
            else{
                if(count!=0){
                    count--;
                }
            }
        }
        if(count<=0){
            System.out.println(0);
            return;
        }
        System.out.println(count);
    }
}
