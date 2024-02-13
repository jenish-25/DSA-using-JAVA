package leetcode;

public class L476_binary0nd1s {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int flag=0;
        for(int i=31;i>=0;i--){
            if(((n >> i) & 1)==0 && flag==0){
                continue;
            }
            else if(((n >> i) & 1)==1){
                flag=1;
            }
            else if(((n >> i) & 1)==0 && flag==1){
                ans+=(1<<i);
            }
        }
        System.out.println(ans);
    }
}
