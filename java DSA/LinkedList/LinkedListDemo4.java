import java.util.LinkedList;

public class LinkedListDemo4 {
    public static void main(String[] args){
        //specific methods
        //used to implement stack and queue operations
        LinkedList l = new LinkedList();

        l.add("Dog");
        l.add("Cat");
        l.add("Cat");
        l.add("Horse");

        System.out.println(l);  //[Dog, Cat, Cat, Horse]

        l.addFirst("Tiger");
        l.addLast("Elephant");
        System.out.println(l);  //[Tiger, Dog, Cat, Cat, Horse, Elephant]

        System.out.println(l.getFirst());  //Tiger
        System.out.println(l.getLast());   //Elephant

        l.removeFirst();
        System.out.println(l);  //[Dog, Cat, Cat, Horse, Elephant]

        l.removeLast();
        System.out.println(l);  //[Dog, Cat, Cat, Horse]
    } 
    
}
