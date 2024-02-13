package OOPs;

public class copyContructor {
    public static void main(String[] args) {

        std s1=new std(25,"jenish");
        s1.display();
        System.out.println("-------------------");
        System.out.println("after coping..");
        std s2=new std(s1);
        s2.display();
    }
}
class std{
    int enroll;
    String name;
    std(int e,String n){
        enroll=e;
        name=n;
    }
    std(std st){
        enroll=st.enroll;
        name=st.name;
    }
    void display(){
        System.out.println(name);
        System.out.println(enroll);
    }
}
