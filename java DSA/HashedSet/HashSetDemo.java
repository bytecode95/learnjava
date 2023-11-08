import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet hs = new HashSet(); //default capacity is 16 & Load factor: 0.75
        
        //give intial capacity and load factor
        HashSet hs1 = new HashSet(100, (float)0.75);

        //restrict to one type
        HashSet<Integer> hs2 = new HashSet<Integer>();

        //add elements or objects into hashset
        hs.add(100);
        hs.add("Welcome");
        hs.add('A');
        hs.add(16.4);
        hs.add(true);
        hs.add(null);
        //hs.add(100);

        System.out.println(hs);  //[null, A, 100, 16.4, Welcome, true]
        //insertion order is not preseved

        //remove element
        hs.remove(16.4);
        System.out.println(hs);  //[null, A, 100, Welcome, true]

        //not direct method to get data
        //contains
        System.out.println(hs.contains(null));  //true
        System.out.println(hs.contains(20));  //false

        System.out.println(hs.isEmpty());  //false

        //read elements of hashset
        //forEachloop
        for(Object item:hs){
            System.out.println(item);
        }

        //iterator()

        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    
    }
}
