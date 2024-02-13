package condition;

public class YearMonthDay {
        public static void main(String args[]){
            int n=650;
            int i=365;
            int temp;
            temp=n/i;
            System.out.println("year=  " + temp);

            int r = n%i;

            int month=r/30;
            System.out.println("month= " +month);

            int days= r%30;
            System.out.println("days = " + days);
        }
    }
