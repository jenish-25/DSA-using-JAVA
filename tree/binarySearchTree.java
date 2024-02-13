package tree;

import java.util.Stack;

public class binarySearchTree {
    public static void main(String[] args) {
        BST bst=new BST();
                                                                   //        40
//        bst.insertBst(40);                                      //       /    \
//        bst.insertBst(20);                                     //       20      70
//        bst.insertBst(70);                                    //       /  \    /  \
//        bst.insertBst(10);                                   //       10  25  65  80
//        bst.insertBst(25);
//        bst.insertBst(65);
//        bst.insertBst(80);
//
//        bst.inOrder(bst.root);
//        System.out.println();
        bst.insertIterative(40);
        bst.insertIterative(20);
        bst.insertIterative(70);
        bst.insertIterative(10);
        bst.insertIterative(25);
        bst.insertIterative(65);
        bst.insertIterative(80);


        bst.inOrderiterative();
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println("\ndelet node is ");
        bst.delet(70);
        bst.inOrder(bst.root);
//        System.out.println();
//        System.out.println(bst.search(bst.root,40));
//        System.out.println(bst.search(bst.root,90));
//        System.out.println(bst.search(bst.root,26));
//        System.out.println("iterative");
//        System.out.println(bst.searchIterative(bst.root,50));
//        System.out.println(bst.searchIterative(bst.root,70));

    }
}
class nod{
    int data;
    nod left,right;
    public nod(int data){
        this.data=data;
    }
}
class BST{
    nod root;
    void insertBst(int value){
        root=insert(root,value);
    }
    public nod insert(nod root,int value) {         // recursion
        if(root==null){
            root=new nod(value);
            return root;
        }
        if(root.data>value){
            root.left=insert(root.left,value);
        }
        else if(root.data<value){
            root.right=insert(root.right,value);
        }
        return root;
    }
    public void inOrder(nod root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void insertIterative(int value) {         // iterative
        nod nn=new nod(value);
        if(root==null){
            root=nn;
            return;
        }
        nod prev=null;
        nod curr=root;
        while (curr != null){
            prev=curr;
            if(value< curr.data){
                curr=curr.left;
            }
            else curr=curr.right;
        }
        if(prev.data > value){
            prev.left=nn;
        }
        else{
            prev.right=nn ;
        }
    }
    public void inOrderiterative(){
       nod temp=root;
        Stack<nod> st=new Stack<>();
        while (temp != null || !st.isEmpty()){
            if(temp != null){
                st.add(temp);
                temp=temp.left;
            }
            else{
                temp=st.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
    public boolean search(nod root,int val){
        if(root==null ){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(root.data>val){
            return search(root.left,val);
        }
        return search(root.right,val);
    }
    public boolean searchIterative(nod root,int val){
        while(root != null){
            if(val>root.data){
                root=root.right;
            }
            else if(val<root.data){
                root=root.left;
            }
            else return true;
        }
        return false;
    }
    public void delet(int value){
        root=deletNode(root,value);
    }
    public nod deletNode(nod root,int value){
        if(root==null){
            return root;
        }
        if(value<root.data){
            root.left=deletNode(root.left,value);
        }
        else if(value>root.data){
            root.right=deletNode(root.right,value);
        }
        else {
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=deletNode(root.right,root.data);
        }
        return root;
    }

    private int minValue(nod right) {
        int min=root.data;
        while (root.left != null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
}