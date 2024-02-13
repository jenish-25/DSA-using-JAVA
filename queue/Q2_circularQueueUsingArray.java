package queue;
public class Q2_circularQueueUsingArray {
    static class circular{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        circular(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1) %size == front;
        }

        public static void add(int value){
            if(isFull()){
                System.out.println("is full");
                return;
            }
            if(front==-1){
                front++;
            }
            rear=(rear+1)%size;
            arr[rear]=value;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int res=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else {
                front=(front+1)%size;
            }
            return res;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty que");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
      circular q=new circular(5);
      q.add(1);
      q.add(2);
      q.remove();
      q.add(3);
      q.add(4);
      q.remove();
      q.add(5);
      q.add(6);
      q.add(7);
      q.add(8);
      q.add(9);
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
      }
    }
}
