package OOPs;

public class Abstarction {
    public static void main(String[] args) {
        hy a=new hy();
        a.start();
    }
}
abstract class hello{
    int num=4;
     void start(){
            System.out.println("hello..");
        }
}
class hy extends hello{
    @Override
    void start() {
        System.out.println("here..");
        System.out.println(num);
    }
}
