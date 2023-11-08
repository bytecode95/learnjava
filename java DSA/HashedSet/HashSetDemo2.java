import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args){
        // union of two sets, find common element in two sets(intersection)
        //difference between two sets

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);  //[1, 2, 3, 4, 5]

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println(set2);  //[3, 4, 5, 6]

        //union - collect all elemnets in set1 and set2 and print only unique elemnts which means remove duplictes
        set1.addAll(set2);
        System.out.println(set1); //[1, 2, 3, 4, 5, 6]

        //intersection - common elements in set1 and set2
        set1.retainAll(set2);
        System.out.println(set1);  //[3, 4, 5]

        //difference - diffrerence elements
        set1.removeAll(set2);
        System.out.println(set1);  

        //getsubset
        //all elements in set2 should be in set1
        System.out.println(set1.containsAll(set2)); //flase
        



    }
}
