package tree;

import java.util.*;

public class leftview {
    public static void main(String[] args) {
        binaryT bt=new binaryT();                         //                    10
        bt.root=new nodde(10);                        //                   / \
        bt.root.left=new nodde(20);              //                      20   30
        bt.root.right=new nodde(30);           //                       / \   / \
        bt.root.left.left=new nodde(40);     //                        40 50  60 70
        bt.root.left.right=new nodde(50);     //                                 / \
        bt.root.right.left=new nodde(60);     //                                80  90
        bt.root.right.right=new nodde(70);
        bt.root.right.right.left=new nodde(80);
        bt.root.right.right.right=new nodde(90);
//        bt.leftview(bt.root);
//        bt.rightview(bt.root);
        System.out.println("top view");
        System.out.println(bt.topView(bt.root));
        System.out.println("bottom view");
        System.out.println(bt.bottomView(bt.root));
    }
}
class binaryT{
    nodde root;
    void leftview(nodde root){
        ArrayList<Integer> list=new ArrayList<>();
        printLeftVew(root,list,0);
        for(int curr: list){
            System.out.print(curr+" ");
        }
    }
    private void printLeftVew(nodde root, ArrayList<Integer> list, int level) {
        if(root==null) return;
        if(list.size()==level) { list.add(root.data);}

        printLeftVew(root.left,list,level+1);
        printLeftVew(root.right,list,level+1);
    }
    void rightview(nodde root){
        ArrayList<Integer> list1=new ArrayList<>();
        PrintRightView(root,list1,0);
        for(int curr: list1){
            System.out.print(curr+" ");
        }
    }
    private void PrintRightView(nodde root, ArrayList<Integer> list1, int leval1) {
        if(root==null){
            return;
        }
        if(list1.size()==leval1){
            list1.add(root.data);
        }
        printLeftVew(root.right,list1,leval1+1);
        printLeftVew(root.left,list1,leval1+1);
    }
    public List<Integer> topView(nodde root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Map<Integer,Integer> hm=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(0,root));
        while (!q.isEmpty()){
            Pair curr=q.poll();
            hm.putIfAbsent(curr.hd, curr.root.data);
            if(curr.root.left != null){
                q.add(new Pair(curr.hd-1,curr.root.left ));
            }
            if(curr.root.right != null){
                q.add(new Pair(curr.hd+1,curr.root.right ));
            }
        }
        list.addAll(hm.values());
        return list;
    }
    public List<Integer> bottomView(nodde root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> hm=new TreeMap<>();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            hm.put(curr.hd, curr.root.data);
            if(curr.root.left != null){
                q.add(new Pair(curr.hd-1,curr.root.left));
            }
            if(curr.root.right != null){
                q.add(new Pair(curr.hd+1,curr.root.right));
            }
        }
        list.addAll(hm.values());
        return list;
    }
}
class nodde{
    int data;
    nodde left,right;
    public nodde(int data){ this.data=data;}
}
class Pair{
    int hd;
    nodde root;
    public Pair(int hd,nodde root){
        this.hd=hd;
        this.root=root;
    }
}