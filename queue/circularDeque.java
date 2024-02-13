package queue;

public class circularDeque {
    static class CDQ{
       static int ans[];
       static int front=-1;
       static int rear=-1;
       static int size=0;
       public CDQ(int k){
            ans=new int[k];
            this.size=k;
        }
        public boolean insertFront(int value) {
            if(isFull()){
                return false;
            }
            if(front==-1 && rear==-1){
                front=rear=0;
                ans[front]=value;
            }
            else if(front==0){
                front=size-1;
                ans[front]=value;
            }
            else{
                front--;
                ans[front]=value;
            }
            return true;
        }

        public boolean insertLast(int value) {
            if(isFull()) return false;
            if(front==-1 && rear==-1){
                front=rear=0;
                ans[rear]=value;
            }
            else if(rear==size-1){
                rear=0;
                ans[rear]=value;
            }
            else{
                rear++;
                ans[rear]=value;
            }
            return true;
        }

        public boolean deleteFront() {
            if(isEmpty()) return false;
            if(front==rear) front=rear=-1;
            else if(front==size-1) front=0;
            else front++;
            return true;
        }

        public boolean deleteLast() {
            if(isEmpty()) return false;
            if(front==rear) front=rear=-1;
            else if(rear==0) rear=size-1;
            else rear--;
            return true;
        }

        public int getFront() {
            if(isEmpty()){
                return -1;
            }
            return ans[front];
        }

        public int getRear() {
            if(isEmpty()){
                return -1;
            }
            return ans[rear];
        }

        public boolean isEmpty() {
            return front==-1 && rear==-1;
        }

        public boolean isFull() {
            return (rear+1)%size==front;
        }
    }
    public static void main(String[] args) {
        CDQ q=new CDQ(3);
        q.insertLast(1);
        q.insertLast(2);
        q.insertFront(3);
        q.insertFront(4);
        q.getRear();
        q.isFull();
        q.deleteLast();
        q.insertFront(4);
        q.getFront();

    }
}
