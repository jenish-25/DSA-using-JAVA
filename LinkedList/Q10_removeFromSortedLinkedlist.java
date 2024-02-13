package LinkedList;

public class Q10_removeFromSortedLinkedlist {
    public static void main(String[] args) {
        remove ls=new remove();
        ls.insert(1);
        ls.insert(5);
        ls.insert(7);
        ls.insert(1);
        ls.insert(3);
        ls.display();
        System.out.println("\nafter delet");
//        ls.removeDuplicate();
        ls.removeInUnSorted();
        ls.display();
    }
}
class remove{
    nod head;
    public void insert(int value){
        nod nn=new nod(value);
        nn.next=null;
        if(head==null){
            head=nn;
            return;
        }
        nod temp=head;
        while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
    }
    public void removeDuplicate(){
        nod temp=head;
        while (temp.next != null) {
            if(temp.val!=temp.next.val){
                temp=temp.next;
            }
            else {
                temp.next=temp.next.next;
            }
        }
    }
    public void display(){
        nod nn=head;
        while (nn!=null){
            System.out.print(nn.val+" ");
            nn=nn.next;
        }
    }

    public void removeInUnSorted() {        //Q22
        nod p1=head;
        nod p2=null;
        while (p1 != null && p1.next != null){
            p2=p1;
            while (p2.next !=null){
                if(p1.val==p2.next.val){
                    p2.next=p2.next.next;
                }
                else p2=p2.next;
            }
            p1=p1.next;
        }
    }

    class nod{
        nod next;
        int val;
        nod(int val){
            this.val=val;
            this.next=null;
        }
    }
}
