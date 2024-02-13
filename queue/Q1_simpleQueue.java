package queue;

public class Q1_simpleQueue {
    static class que{
        static int arr[];
        static int size;
        static int rear;
        que(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isFull(){
            return rear==size-1;
        }
        public static void add(int value){
            if(isFull()){
                System.out.println("que is full");
                return;
            }
            rear++;
            arr[rear]=value;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("que is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty que");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        que q=new que(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
