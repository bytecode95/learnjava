public class Main {
    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(18);
        list.insertFirst(25);
        list.insertLast(99);
        list.insert(55, 3);
        list.insert(30, 1);
        list.display();
        list.deletefirst();
        list.display();
        list.deletelast();
        list.display();
        list.delete(2);


        list.display();
    }
    
}
