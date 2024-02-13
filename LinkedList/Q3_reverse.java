package LinkedList;

import java.util.Stack;

public class Q3_reverse {
    public static void main(String[] args) {
        LL ls=new LL();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.print();
        System.out.println("\nafter reverse ");
        ls.reverse();
    }
}
class LL{
    node2 head;
    node2 tail;
    class node2{
        int data;
        node2 next;
        public node2(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int value){
        node2 nn= new node2(value);
        if(head==null){
            head=nn;
            tail=nn;
            return;
        }
        tail.next=nn;
        tail=nn;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
        }
        node2 temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void reverse(){
        Stack<Integer> st=new Stack<>();
//        if(head==null){
//            System.out.println("empty");
//        }
        node2 temp=head;
        while(temp != null){
            st.push(temp.data);
            temp=temp.next;
        }
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
