package OOPs;

import java.sql.SQLOutput;

public class Q5_HolidayDetail {
    public static void main(String[] args){
        Holiday h1 = new Holiday("Holi",29,"March");
        Holiday h2 = new Holiday("Dhuleti",29,"March");
        Holiday h3 = new Holiday("Dhuleti",30,"March");
        System.out.println( h1.inSameMonth(h2));
        System.out.println( h1.inSameMonth(h3));
        month m=month.JANUARY;
        System.out.println(m);



        Holiday[] holidayArray = {h1, h2, h3};
//        double averageDate = Holiday.avgDate(holidayArray);
        System.out.println("Average date of holidays : " + Holiday.avgDate(holidayArray));
    }
}
enum month{
    JANUARY,FEBRUARY;
}
class Holiday{
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holiday h1){
        if(this.month== h1.month){
            return true;
        }
        return false;
    }
    public static double avgDate(Holiday[] holidays){
        int totalDays = 0;
        for(int i = 0;i < holidays.length;i++){
            totalDays = totalDays + holidays[i].day;
        }
        return totalDays / holidays.length;
    }

}