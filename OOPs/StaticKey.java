package OOPs;

/*Write a program to demonstrate use of static variables,
        methods and block.*/

public class StaticKey {
    public static void main(String[] args) {
        stu.diplay();
    }
}
class stu{
    static int x=5;
    static void diplay(){
        System.out.println(x);
    }
    static {
        System.out.println("hello!!");
    }
}