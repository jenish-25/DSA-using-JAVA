package leetcode;

public class L1688_CountMatchesInTournament {
    public static void main(String[] args) {
        int n=14;
        int matches=0,advance=0,count=0;
        while(n!=1){
            if(n%2==0){
                matches=n/2;
                advance=n/2;
                n=advance;
                count+=matches;
            }
            else if(n%2!=0){
                matches=(n-1)/2;
                advance=((n-1)/2)+1;
                n=advance;
                count+=matches;
            }
        }
        System.out.println(count);
    }
}
