package OOPs;

import java.util.ArrayList;

public class generic_class {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(54);
        list.add(643);

        int  a=list.get(0);
        myGeneric<String,Integer> g1 = new myGeneric(23, "mystring", 45);
        String str= g1.getT1();
        Integer i1= g1.getT2();
        Integer i2= g1.getVal();
        System.out.println(str +" "+ i1 + " " +  i2);
//        System.out.println(i1);
    }
}
class myGeneric<T1,T2>{
    int val=344;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
