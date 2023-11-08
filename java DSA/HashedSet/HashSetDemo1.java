import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args){
        HashSet<Integer> evenNumber = new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println(evenNumber);  //[2, 4, 6, 8]

        HashSet<Integer> number = new HashSet<Integer>();
        number.addAll(evenNumber);
        number.add(10);
        System.out.println(number);   //[2, 4, 6, 8, 10]

        //removeall
        number.removeAll(evenNumber);
        System.out.println(number);   //[10]

    }
}
