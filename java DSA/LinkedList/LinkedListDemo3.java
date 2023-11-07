import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<String>();

        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println(l);  //[X, Y, Z, A, B, C]

        LinkedList<String> new_l = new LinkedList<String>();
        new_l.addAll(l);
        System.out.println(new_l);  //[X, Y, Z, A, B, C]

        new_l.removeAll(l);
        System.out.println(new_l);  //[]

        //sorting and shuffling are possible when we homogenous data/same kind of data
        //sort()  Collection.sort(collection)

        System.out.println("before sorting: "+l);  //before sorting: [X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("After sorting: "+l);  //After sorting: [A, B, C, X, Y, Z]

        //reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("After reversing: "+l);  //After reversing: [Z, Y, X, C, B, A]

        //shuffling
        Collections.shuffle(l);
        System.out.println("After shuffle: "+l);  //After shuffle: [X, Z, C, A, B, Y]

        
    }
}
