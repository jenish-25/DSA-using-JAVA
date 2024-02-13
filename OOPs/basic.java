package OOPs;

public class basic {
    public static void main(String[] args) {
        Employe e1=new Employe();
        e1.Employe(1,"jenish",1000);
//        System.out.println(e1.num + " "+ e1.salary+" "+e1.name);
        e1.setSalary(2000);
//        System.out.println(e1.num + " "+ e1.salary+" "+e1.name);
        System.out.println(e1.getNum(25));
//        System.out.println(e1.num + " "+ e1.salary+" "+e1.name);

    }
}
class Employe{                     //class
   private int num;
    String name;
    double salary;

    void Employe(int num,String name,double salary){          //method
        this.num=num;
        this.name=name;
        this.salary=salary;
    }
    Employe(){};                  //default constructor

    Employe(int num,String name){       //perameterised constructor
        this.num=num;
        this.name=name;
    }
    void setSalary(double salary){      //setter method

        this.salary=salary;
    }
    int getNum(int num){
        return num;
    }
}

