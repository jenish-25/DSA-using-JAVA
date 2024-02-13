package tree;

import java.util.*;

public class treebasic {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();                  //                    10
        bt.root=new Node(10);                        //                   / \
        bt.root.left=new Node(20);              //                      20   30
        bt.root.right=new Node(30);           //                       / \   / \
        bt.root.left.left=new Node(40);     //                        40 50  60 70
        bt.root.left.right=new Node(50);
        bt.root.right.left=new Node(60);
        bt.root.right.right=new Node(70);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans=bt.zigzag(bt.root);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println("level order");
        bt.levelOrder();

        System.out.println("\npre order");
        bt.preOrder(bt.root);
        System.out.println();
        bt.pre(bt.root);

        System.out.println("\npost order");
        bt.postOrder(bt.root);
        System.out.println();
        System.out.print(bt.post(bt.root));

        System.out.println("\nin order");
        bt.inOrder(bt.root);

        System.out.println("\nNodes is ");
        bt.countNodes();

        bt.NthNode(bt.root,4);

        System.out.println(bt.findEle(bt.root,110));

        System.out.println("height is "+ bt.height(bt.root));

        System.out.println("max num is "+ bt.maximum(bt.root));
        System.out.println("diameter of tree is "+ bt.diameter(bt.root));
        System.out.println("\nprint leaf node");
        bt.printLeaf(bt.root);
    }
}
class BinaryTree{
    Node root;
    int count=0;
    public void levelOrder(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node n=q.poll();
            System.out.print(n.data+" ");
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void pre(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            System.out.print(curr.data+" ");
            if(curr.right != null){
                st.push(curr.right);
            }
            if(curr.left != null){
                st.push(curr.left);
            }
        }
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public ArrayList<Integer> post(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<Node> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            Node curr=st.peek();
            if(curr.left==null && curr.right==null){
                Node pop=st.pop();
                list.add(pop.data);
            }
            else {
                if(curr.right != null){
                    st.push(curr.right);
                    curr.right=null;
                }
                if(curr.left != null){
                    st.push(curr.left);
                    curr.left=null;
                }
            }
        }
        return list;
    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void countNodes(){         //Q3
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            c++;
            Node nn=q.poll();
            if(nn.left != null){
                q.add(nn.left);
            }
            if(nn.right != null){
                q.add(nn.right);
            }
        }
        System.out.println(c);
    }
    public void NthNode(Node root, int i) {     //Q4
        if(root==null){
            return;
        }
        NthNode(root.left,i);
        count++;
        if(count==i){
            System.out.println(root.data);
        }
        NthNode(root.right,i);
    }
    public boolean findEle(Node root,int i){      //Q5
        if(root==null){
            return false;
        }
        if(root.data==i){
            return true;
        }
        return findEle(root.left,i) || findEle(root.right,i);
    }
    public int height(Node root){         //q6
        if(root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int diameter(Node root){          //40 to 70 distance
        if(root==null) return 0;
        int dialeft=diameter(root.left);
        int diaright=diameter(root.right);
        int curr=height(root.left)+height(root.right)+1;
        return Math.max(curr,Math.max(dialeft,diaright));
    }
    public int maximum(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    public  ArrayList<ArrayList<Integer>> zigzag(Node root){
        Queue<Node> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        boolean flag=true;
        while (!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                if(flag==true){
                    list.add(q.poll().data);
                }
                else{
                    list.add(0,q.poll().data);
                }
            }
            flag= !flag;
            ans.add(list);
        }
        return ans;
    }
    public void printLeaf(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            System.out.println(root.data);
            return;
        }
        if(root.left != null){
            printLeaf(root.left);
        }
        if(root.right != null){
            printLeaf(root.right);
        }
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
