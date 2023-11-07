public class Basic{
   public static void main(String[] args){
      LinkedList list = new LinkedList();
      list.insert(23);
      list.insert(54);
      list.insert(35);
      list.insert(40);
      list.insert(23);

      list.insertAtStart(18);
      list.insertAt(2, 60);

      list.show();

   }
}