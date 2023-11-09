import java.util.Arrays;

public class Operations {
   public static void main(String[] args){
        //this is not a good solution
        //bacuse of memory wastagees. since Strings are immutable new series String will created in every iteration in loop
        String series="" ;
        for(int i=0; i<26; i++){
            char ch = (char)('a'+ i);
            series += ch;
            System.out.println(series);
            System.out.println(series.hashCode());
        }
        System.out.println(series);
        System.out.println(series.hashCode());
        System.out.println("--------------------------------");
        String modify = series.toUpperCase();
        System.out.println(modify);
        System.out.println(modify.hashCode());

        //StringBuilder
        //StringBuilder will not create new object it will update/ modify new object
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a'+ i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.hashCode());
        builder.reverse();
        System.out.println(builder);
        System.out.println(builder.hashCode());
        builder.deleteCharAt(0);
        System.out.println(builder);
        System.out.println(builder.hashCode());


        String name = "Chethana Virajini";
        System.out.println(name.toCharArray());   //Chethana Virajini
        System.out.println(Arrays.toString(name.toCharArray()));  //[C, h, e, t, h, a, n, a,  , V, i, r, a, j, i, n, i]

        
   }
}
