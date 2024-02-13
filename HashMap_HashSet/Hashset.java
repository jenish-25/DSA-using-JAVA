package HashMap_HashSet;
import  java.util.HashSet;
import  java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(3);

//        System.out.println(!st.contains(4));
//        st.remove(5);
//        System.out.println(st.contains(5));
//        System.out.println(st);
//        Iterator<Integer> itr=st.iterator();
//            while (itr.hasNext()){
//                System.out.println(itr.next());
//            }
        HashSet<Integer> st2=new HashSet<>();
        st2.add(5);
        st2.add(6);
        st2.add(7);
        st.addAll(st2);
        System.out.println(st);


    }
}
