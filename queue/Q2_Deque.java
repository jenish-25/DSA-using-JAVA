package queue;

import java.util.Arrays;

public class Q2_Deque {
   static int rear=-1;
   static int front=0;
   static int totalELe=0;
   static int size=10;
   static int[] arr=new int[size];

    public static void main(String[] args) {
        addRear(10);
        addRear(11);
        addfront(5);
        deletfront();
        deletRear();
        System.out.println(Arrays.toString(arr));
    }
    public static void addRear(int val){
        if(totalELe==size){
            System.out.println("queue is full");
        }
        else{
            rear=(rear+1)%size;
            arr[rear]=val;
            totalELe++;
        }
    }
    public static void deletRear(){
        if(totalELe==0){
            System.out.println("queue is empty");
        }
        else{
           if(rear==-1){
               rear=size-1;
           }
            System.out.println("num deleted from rear is "+ arr[rear]);
           totalELe--;
           rear--;
        }
    }
    public static void addfront(int val){
        if(totalELe==size){
            System.out.println("queue is full");
        }
        else{
           if(front==0){
               front=size-1;
           }
           else {
               front--;
           }
           arr[front]=val;
           totalELe++;
        }
    }
    public static void deletfront(){
        if(totalELe==0){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("num deleted from rear is "+ arr[front]);
            front=(front+1)%size;
            totalELe--;
        }
    }
}
