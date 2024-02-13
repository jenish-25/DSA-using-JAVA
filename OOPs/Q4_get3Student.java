package OOPs;

public class Q4_get3Student {
    public static void main(String[] args) {
        student s1=new student(100,"jenish",30,30,30);
        student s2=new student(101,"dhruv",20,20,20);
        student s3=new student(102,"deep",10,10,10);
        student s4=new student(103,"jems",15,15,15);
        student s5=new student(104,"kenil",45,5,10);

        student[] students=new student[5];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        students[4]=s5;

        student.getTop3Student(students);
    }
}
class student{
     private int rollNo;
     private String name;
     private int marks1;
     private int marks2;
     private int marks3;
     private int perc;

    public student(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        perc=(marks1+marks2+marks3)/3;
    }
    public static void getTop3Student(student[] students){
        for(int i=0;i< students.length;i++){
            for(int j=0;j< students.length-i-1;j++){
                if(students[j].perc< students[j+1].perc){
                    student temp=students[j+1];
                    students[j+1]=students[j];
                    students[j]=temp;
                }
            }
        }
        student max1=students[0];
        student max2=students[1];
        student max3=students[2];

        System.out.println(max1.rollNo+" "+max1.name+" "+ max1.perc);
        System.out.println(max2.rollNo+" "+max2.name+" "+ max2.perc);
        System.out.println(max3.rollNo+" "+max3.name+" "+ max3.perc);

    }
}