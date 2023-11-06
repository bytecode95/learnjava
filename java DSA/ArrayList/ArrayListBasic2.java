import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic2 {
    public static void main(String[] args){

        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        System.out.println(al);
        //copy arraylist to another arraylist
        ArrayList al_duplicate = new ArrayList();
        al_duplicate.add(al);
        System.out.println(al_duplicate);  //[[X, Y, Z, A, B, C]]

        al_duplicate.remove(0);
        System.out.println(al_duplicate); //[]

        //Sortin array --- Collections.sort()

        System.out.println(al);  //[X, Y, Z, A, B, C]
        Collections.sort(al);
        System.out.println(al);  //[A, B, C, X, Y, Z]


    }
}
