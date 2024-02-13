package OOPs;

public class Interface {
    public static void main(String[] args) {
        first n1=new first();
        last n2=new last();
        n1.display();
        n2.display();
    }
}
interface name{
    void display();
}
class first implements name{
   public void display(){
       System.out.println("jenish");
    }
}
class last implements name{
    public void display()
    {
        System.out.println("vavadiya");
    }
}
