//java compiler complied this code and converted into bytecode .class file.
// this .class file can be only executed by JVM.

import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        System.out.println("Hello World!");
        //here println function overloading
        System.out.println(56);
        String name = "chethana";
        System.out.println(name);
        System.out.println('A');
        int[] nums = {2,4,6,7};
        //function overriding -- here toString method is over-riding use toString method in Arrays.util Pacakge
        System.out.println(nums);   //[I@49e4cb85
        System.out.println(Arrays.toString(nums));  //[2, 4, 6, 7]
    }
}
