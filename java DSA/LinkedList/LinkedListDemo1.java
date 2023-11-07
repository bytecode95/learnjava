import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args){

        //Declare a LinkedList
        LinkedList l = new LinkedList();

        //Restrict to Homogeneous data
        LinkedList <Integer> l1 = new LinkedList<Integer>();
        LinkedList <String> l2 = new LinkedList<String>();

        //add elements to linkedlist
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);  //[100, welcome, 15.5, A, true, null]

        System.out.println("Size of linkedlist: "+l.size());  //Size of linkedlist: 6

        //remove
        l.remove(3);
        System.out.println("After removing: "+l);  //After removing: [100, welcome, 15.5, true, null]

        l.remove('A');
        System.out.println(l);  //error

        //insert method--adding element somewhere on linked list
        l.add(3,"Java");
        System.out.println(l);   //[100, welcome, 15.5, Java, true, null]

        //retrieveing value/object
        System.out.println(l.get(4));   //Java

        //change element
        l.set(5, "X");
        System.out.println(l);   //[100, welcome, 15.5, Java, true, X]

        //contains -- get to know element is present or not
        System.out.println(l.contains("Java"));   //true
        System.out.println(l.contains("java"));   //false

        //isEmpty
        System.out.println(l.isEmpty());  //false

    } 
}
