package HashMap_HashSet;

import java.util.HashMap;

public class LruCaCheCode {
    public static void main(String[] args) {
     Lru lru=new Lru(5);
     lru.add(1);
     lru.add(2);
     lru.add(3);
     lru.add(4);
     lru.add(5);
     lru.add(2);
     lru.add(7);
     lru.add(8);
     lru.print();
    }
}
class Lru{
    HashMap<Integer,Node> hm=new HashMap<>();
    int capacity;
    doublyLL ddl =new doublyLL();
    public Lru(int capacity){
        this.capacity=capacity;
    }
    public void add(int value){
        if(hm.containsKey(value)){
            if(ddl.tail.data == value){
                return;
            }
            Node add=hm.get(value);
            ddl.remove(add);
            hm.remove(value);
        }
        if(hm.size()==capacity){
            int d=ddl.removeFirst();
            hm.remove(d);
        }
        Node nn=ddl.insertLast(value);
        hm.put(value,nn);
    }
    public void print(){
        ddl.printL();
    }
}
class doublyLL{
    Node head;
    Node tail;
    public  void remove(Node address) {
        if(head==tail && head== address){
            head=tail=null;
        }
        else if(address==head){
            head=head.next;
            head.prev=null;
        }
        else{
            address.prev.next=address.next;
            address.next.prev=address.prev;
        }
    }
    public int removeFirst() {
        int data=head.data;
        head=head.next;
        head.prev=null;
        return data;
    }
    public Node insertLast(int value) {
        Node nn=new Node(value);
        if(head==null){
            head=tail=nn;
        }
        else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
        return nn;
    }
    public void printL() {
        if(head==null){
            return;
        }
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
    }
}

