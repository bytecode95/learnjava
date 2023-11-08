
public class Basic {
    public static void main(String[] args){
        String name = "Chethana Virajini";
        System.out.println(name);

        String a = "Chethana";
        String b = "Chethana";
        System.out.println(a);
        System.out.println(System.identityHashCode(a) );
        System.out.println(b);
        System.out.println(System.identityHashCode(b) );

        System.out.println(a==b);  //true
        System.out.println(a.equals(b));  //true

        a = "Virajini";
        System.out.println(a);

        //how to create a same values two objects

        String name1 = new String("Kamal");
        System.out.println(System.identityHashCode(name1) );
        String name2 = new String("Kamal");
        System.out.println(System.identityHashCode(name2) );

        System.out.println(name1==name2);  //false
        System.out.println(name1.equals(name2));  //true
    }
}
