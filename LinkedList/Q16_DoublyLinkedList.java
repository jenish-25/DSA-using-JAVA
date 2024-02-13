package LinkedList;

public class Q16_DoublyLinkedList {
    public static void main(String[] args) {
        Dll ls=new Dll();
//        ls.insertfirst(10);
//        ls.insertfirst(20);
//        ls.insertfirst(30);
        ls.insertLast(10);
        ls.insertLast(50);
        ls.insertLast(30);
//        ls.insertLast(30);
        ls.insertLast(50);
        ls.insertLast(80);
        ls.insertLast(70);
        ls.reverse();
//        System.out.println("\ninsert last");
//        ls.insertLast(10);
//        ls.insertLast(20);
//        ls.insertLast(30);
//        ls.reverse();
//        System.out.println("insert at eni position");
//        ls.insert(30,31);
//        ls.delet(30);
//        ls.reverse();
//        System.out.println("after remove duplicate");
//        ls.removeDuplicate();
//        ls.reverse();
        System.out.println("pair");
        ls.PairWithGivenSum(60);
//        System.out.println("\nafter delet node");
//        ls.deletNode(ls.head.next);
        System.out.println();
        ls.removeInUnsorted();
        ls.reverse();
    }
}
class    Dll{
    nd head;
//    nd tail;
    public void insertfirst(int val){
        nd nn=new nd(val);
        nn.next=head;
        nn.prev=null;
        if(head != null){
            head.prev=nn;
        }
        head=nn;
    }
    public void insertLast(int val){
        nd nn=new nd(val);
        nd last=head;
        nn.next=null;
        if(head==null){
            nn.prev=null;
            head=nn;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=nn;
        nn.prev=last;
    }
//    public void display(){
//        nd temp=head;
//        nd last=null;
//        while(temp != null){
//            System.out.print(temp.val + " ");
//            last=temp;
//            temp=temp.next;
//        }
//        System.out.println();
//    }
    public void insert(int after,int val){
        nd p=find(after);
        if(p==null){
            System.out.println("not exist");
        }
        nd nn=new nd(val);
        nn.next=p.next;
        nn.prev=p;
        p.next=nn;
        if(nn.next != null){
            nn.next.prev=nn;
        }
    }
    public nd find(int value){
      nd nn=head;
      while(nn!=null){
          if(nn.val == value){
              return nn;
          }
          nn=nn.next;
      }
      return null;
    }
    public void reverse(){                          //Q18
        nd nn=head;
        nd last=null;
        while(nn!= null){
            System.out.print(nn.val+" ");
            last=nn;
            nn=nn.next;
        }
        System.out.println("\nprint in reverse");
        while (last != null){
            System.out.print(last.val+" ");
            last=last.prev;
        }
        System.out.println();
    }
    public void delet(int value){
        nd curr = head.next;
        nd prev = head;
        if(head==null){                              //for if no element in list
            System.out.println("empty");
        }
        else if(head.val==value){                 //for if head element to delet
            nd temp=head;
            head=head.next;
            temp.next=null;
            head.prev=null;
        }
        else{                                          //for head sivay na badha
            while(curr!=null && curr.val !=value){
                prev=curr;
                curr=curr.next;
            }

            if(curr !=null && curr.val==value){
                prev.next=curr.next;
                curr.next.prev=prev;
                curr.next=null;
                curr.prev=null;
            }
        }
    }
    public void PairWithGivenSum(int target){      //Q17
       nd previous=head;
        nd start=head;
        while(previous.next != null){
            previous=previous.next;
        }
        while (start != previous && previous.next != start){
            if(start.val + previous.val == target){
                System.out.print("("+start.val+","+previous.val+")");
                start=start.next;
                previous=previous.prev;
            }else if(start.val + previous.val >= target){
                previous=previous.prev;
            }
            else start=start.next;
        }
    }
    public void removeDuplicate(){         //Q20
        nd temp=head;
        while (temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next.next.prev=temp;
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
    public void removeInUnsorted() {
        nd p1,p2;
        for (p1 = head; p1 != null ; p1=p1.next) {
            p2=p1;
            while (p2.next != null){
                if(p1.val == p2.next.val){
                    nd temp=p2;
                    p2.next=p2.next.next;
                    p2.next.prev=temp;
                }
                else p2=p2.next;
            }
        }
    }
        public void deletNode(nd p){        //Q21
        p.val=p.next.val;
        p.next=p.next.next;
        p.next.prev=p;
    }
    class nd{
        int val;
        nd next;
        nd prev;
       public nd(int val){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}