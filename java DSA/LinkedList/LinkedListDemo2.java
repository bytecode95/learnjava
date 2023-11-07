import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.add(100);
        l.add("Hello");
        l.add('B');
        l.add(true);
        l.add(10.5);

        System.out.println(l);  //[100, Hello, B, true, 10.5]

        //reading elements from linkedlist
        //for loop
        for(int i=0; i < l.size(); i++){
            System.out.println(l.get(i));
        }

        //foreach loop
        for(Object value: l){
            System.out.println(value);
        }

        //iterator
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
