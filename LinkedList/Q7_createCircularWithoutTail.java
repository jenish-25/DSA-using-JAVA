package LinkedList;

public class Q7_createCircularWithoutTail {
    public static void main(String[] args) {
        CLL lr=new CLL();
        lr.insert(10);
        lr.insert(20);
        lr.insert(30);
        lr.insert(40);
        lr.insert(50);
        lr.display();
        lr.exchangeHeadAndTail();
        System.out.println("after exchange first and last");
        lr.display();
    }
}
class CLL{
    node3 head;
    class node3{
        int data;
        node3 next;
        node3(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int data){
        node3 nd=new node3(data);
        node3 temp=head;
        if(head==null){
            head=nd;
            nd.next=head;
        }
        else{
            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=nd;
            nd.next=head;
        }
    }
    public void exchangeHeadAndTail(){
        if (head.next.next == head) {
            head = head.next;
            return;
        }
        node3 temp=head;
        while (temp.next.next != head){
            temp=temp.next;
        }
        temp.next.next=head.next;
        head.next=temp.next;
        temp.next=head;
        head=head.next;
   }
    public void display(){
        node3 temp=head;
        if(head==null){
            System.out.println("is empty");
            return;
        }
           do{
               System.out.print(temp.data+" ");
               temp=temp.next;
           }while (temp!=head);
        System.out.println();
    }
}
