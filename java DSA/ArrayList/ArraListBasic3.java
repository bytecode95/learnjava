import java.util.ArrayList;
import java.util.Arrays;

public class ArraListBasic3 {
    public static void main(String[] args){
        String[] arr = {"Dog", "Cat", "Elephant"};

       //To print elements using foreach loop
       for(String str: arr){
            System.out.println(str);
       }

       //convert array into arraylist 

       ArrayList al = new ArrayList(Arrays.asList(arr));
       System.out.println(al);  //[Dog, Cat, Elephant]




    } 
}
