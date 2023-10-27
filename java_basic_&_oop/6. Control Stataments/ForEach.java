//The enhanced for loop, also known as the "for-each" loop, in Java is a concise and readable way 
//to iterate over elements in an array or a collection (such as a List or Set). 
//It was introduced in Java 5 to simplify the process of iterating through collections without the need for explicit index variables.


public class ForEach {
    public static void main(String[] args){
        int[] ar = {25, 37, 59,19,38};

        for(int num: ar){
            System.out.println(num);
        }
    }
}
