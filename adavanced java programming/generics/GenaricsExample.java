import java.util.ArrayList;
import java.util.List;

public class GenaricsExample {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Chethana");
        list.add(7);
        list.add(null);
        list.add('a');
        System.out.println(list);
        //here we can use Object type also without anything allowed.
        //why we are using generic. then it will be more safer. complier will check the relevant datatype in data structures
        List<String> list2 =  new ArrayList<>();
        list2.add("null");
        list2.add("Chethana");
        //list2.add(7);   compile time error
    
    
    
    }
}
