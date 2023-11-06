import java.util.ArrayList;
import java.util.List;

public class ArrayListBasic {
    public static void main(String[] args){
        //Declare a Arraylist
        ArrayList al = new ArrayList();

        //Restrict ArrayList to specific data type
        ArrayList <Integer> al1 = new ArrayList<Integer>();
        ArrayList <String> al2 = new ArrayList<String>();

        //ArrayList is a class derived from List Inteface
        //Can Create referecne variable List Interface also
        List al3 = new ArrayList();

        //methods in arraylist
        //add new elements at end of the arraylist
        al.add(100);
        al.add("Welcome");
        al.add(50.5);
        al.add('a');
        al.add(true);
        System.out.println(al);   //[100, Welcome, 50.5, a, true]

        //How many objects in arraylist
        System.out.println("Number of elements in arraylist: "+al.size());  //5

        //remover elements method in arraylist
        System.out.println(al.remove(1));  //through index
        //System.out.println("Wecome");          //through element
        System.out.println("After removeing Number of elements in arraylist: "+al.size());

        //insert a new element -- this will insert new element somewhere middle in the arraylist
        al.add(0, "Java");
        System.out.println(al);   //[Java, 100, 50.5, a, true]

        al.add(2, "python");
        System.out.println(al);  //[Java, 100, python, 50.5, a, true]

        //Retrieve specific value from arraylist
        System.out.println(al.get(4));  //a

        //change a existing value/replace value
        al.set(2, 30);
        System.out.println(al);  //[Java, 100, 30, 50.5, a, true]

        //check/search an element in arraylist
        System.out.println(al.contains(30)); //true
        System.out.println(al.contains("C#")); //false

        System.out.println(al.isEmpty());  //false
        

    }
}
