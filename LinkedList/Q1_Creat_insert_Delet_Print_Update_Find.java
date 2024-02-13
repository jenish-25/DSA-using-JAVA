package LinkedList;

public class Q1_Creat_insert_Delet_Print_Update_Find {
    public static void main(String[] args) {
        linklist ls=new linklist();
//        ls.insertFirst(1);
//        ls.insertFirst(2);
//        ls.insertFirst(3);
        ls.insert(1);
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(6);
        ls.insert(7);
        ls.print();
        ls.reverse();
        System.out.println("-->");
        ls.print();
    }
}
class linklist {
    node head;
    node tail;
    class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertFirst(int data) {
        node nn = new node(data);
        if (head == null) {
            head = nn;
        } else {
            nn.next = head;
            head = nn;
        }
    }
public void insert(int value){
    node nn=new node(value);
    nn.next=null;
    if(head==null){
        head=nn;
        return;
    }
    node temp=head;
    while (temp.next!=null){
        temp=temp.next;
    }
    temp.next=nn;
}
    public void print() {
        if (head == null) {
            System.out.println("empty");
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void reverse(){        //Q11
        node prev=null;
        node curr=head;
        node temp=null;
        while (curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }

}
