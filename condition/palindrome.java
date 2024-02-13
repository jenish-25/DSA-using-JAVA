package condition;

public class palindrome {
        public static void main(String args[]){
            int num=123321;
            int reminder,reverse=0,temp;

            temp=num;
            while(num>0){
                reminder=num%10;
                reverse=(reverse*10)+ reminder;
                num/=10;
            }
            if(temp==reverse){
                System.out.println(temp + "  its palindrome");
            }
            else{
                System.out.println("its not palindrome");
            }
        }
}
