package OOPs;

import java.util.Scanner;

public class Q1_student {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input();
        s1.show();
        Student s2=new Student();
        s2.input();
        s2.show();
        Student s3=new Student();
        s3.input();
        s3.show();
    }
}
class Student{
    static int unique;
    int rNo;
    String name;
    int[] marks;
    int totalMarks;

    Student(){
        unique++;
        rNo=unique;
        marks=new int[5];
    }
    public void  input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("name  : ");
        name=sc.nextLine();
        this.name=name;
        System.out.println("enter marks : ");
        for(int i=0;i< marks.length;i++){
            marks[i]=sc.nextInt();
        }
        this.marks=marks;
    }
    public int totalMarks(){
        for(int i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }
        return totalMarks;
    }
    public int avg(){
        return totalMarks/marks.length;
    }
    public int getHighest(){
        int max=0;
        for(int i=0;i<marks.length;i++){
            max=Math.max(max,marks[i]);
        }
        return max;
    }
    public int getlowest(){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<marks.length;i++){
           min = Math.min(min,marks[i]);
        }
        return min;
    }
    public int getPass(){
        int count=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=50){
                count++;
            }
        }
        return count;
    }
    public static void totalStudent(){
        System.out.println(unique);

    }
    public void show(){
        System.out.println("name  =  "+ name);
        System.out.println("roll num.  =  "+ rNo);
        System.out.println("Total marks = "+totalMarks());
        System.out.println("highest marks = "+getHighest());
        System.out.println("lowest marks ="+ getlowest());
        System.out.println("average among all subject = "+ avg());
        System.out.println("num of subject that in student pass = "+ getPass());


    }
}
