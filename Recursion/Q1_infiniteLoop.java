package Recursion;

public class Q1_infiniteLoop {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        System.out.println(1);
        print();
    }
}
