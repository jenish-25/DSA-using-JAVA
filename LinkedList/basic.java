package LinkedList;

public class basic {
    public static void main(String[] args) {
        Linkedlist ls=new Linkedlist();
        ls.insertLast(10);
        ls.insertLast(20);
        ls.insertLast(30);
//        ls.print();
//        ls.delet(30);
//        System.out.println("after delet");
//        ls.insertLast(40);
        ls.insertLast(50);
        ls.insertLast(70);
        ls.insertLast(80);
        ls.update(20,60);
//        ls.find(20);
//        ls.find(60);
        ls.print();
        System.out.println("\nsize is : "+ls.size);
//        ls.deleteFirst();
//        System.out.println("after delet first");
//        ls.print();
        ls.deleteLast();
        System.out.println("after delet last");
        ls.print();
        System.out.println("\nafter delet node");
        ls.deletnode(ls.head.next);
        ls.print();
        System.out.println("\nget Nth node: ");
        System.out.println(ls.getNthNode(0));
        System.out.println("get  Nth from last :" );
        ls.printNthFromLast(2);
        System.out.println("midlle of the linkedlist is "+ls.middle());
//        System.out.print(ls.middle());
        ls.checkLoop();
        ls.countNodes();
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;
    public Linkedlist(){
        size=0;
    }
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertLast(int data){
        Node nn = new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
        size++;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public void delet(int value){
        Node curr = head.next;
        Node prev = head;
        if(head==null){                              //for if no element in list
            System.out.println("empty");
            return;
        }
        if(head==tail && head.data==value){          //for if only 1 element in a list
            head=null;
            tail=null;
        }
        else if(head.data==value){                 //for if head element to delet
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        else{                                          //for head sivay na badha
            while(curr!=null && curr.data !=value){
                prev=curr;
                curr=curr.next;
            }
            if(curr==tail){
                tail=prev;
            }
            if(curr !=null && curr.data==value){
                prev.next=curr.next;
                curr.next=null;
            }
        }
        size--;
    }
    public void update(int old,int newV){
        int p=0;
        if(head == null){
            System.out.println("empty");
        }
        Node curr=head;
        while(curr.next != null){
            if(curr.data == old){
                curr.data=newV;
            }
            curr=curr.next;
            p++;
        }
    }
    public void find(int value){
        Node curr=head;
        int i=1;
        boolean flag=false;
        if(head==null){
            System.out.println("empty");
        }
        else{
            while(curr!=null){
                if(curr.data==value){
                    flag=true;
                    break;
                }
                i++;
                curr=curr.next;
            }
        }
        if(flag){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
    public Node get(int idx){
        Node nn=head;
        for(int i=0;i<idx;i++){
            nn=nn.next;
        }
        return nn;
    }
    public int deleteFirst(){
        int val=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(head == null || head.next == null) {
            return deleteFirst();
        }
        Node secondlast=get(size-2);
        int val=tail.data;
        tail=secondlast;
        tail.next=null;
        return val;
    }
    public void deletnode(Node val){     //30 is delet    //Q6
        val.data=val.next.data;
        val.next=val.next.next;
    }
    public int getNthNode(int idx){                      // Q4
        Node n=head;
        int count=0;
        while (n != null){
           if(count==idx){
               return n.data;
           }
            count++;
           n=n.next;
        }
        return 0;
    }
    public void printNthFromLast(int idx){                //Q5
        int count=0;
        Node temp=head;
        while (temp != null){          //for count node in linkedlist
            temp=temp.next;
            count++;
        }
        if (count<idx){               //if idx is greter than count
            return;
        }
        temp=head;
        for (int i=1;i<count-idx+1;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public int middle(){            //Q9
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void checkLoop(){                   //Q14 detect loop
        tail.next=head.next;
        System.out.println(tail.data);
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("loop is found");
                return;
            }
        }
        if(fast == null || fast.next==null){
            System.out.println("loop is not found in linkedlist");
        }
    }
    public void countNodes(){            //Q15
        tail.next=head.next;
        Node slow=head;
        Node fast=head;
        int count=1;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                while (fast != slow){
                    count++;
                     slow=slow.next;
                }
                System.out.println(slow.data);
                System.out.println("count is "+count);
                return;
            }
        }
        if(fast ==null || fast.next == null){
            System.out.println("no loop is found");
        }
    }
}
