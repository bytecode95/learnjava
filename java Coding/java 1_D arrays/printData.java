

public class PrintData {
    public static void main(String[] args){
        int[] ar = new int[5];
        //every element of ar array is 0
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
        //How to print every element in an array this is O(n) time complexity
        int[] numbers = {25, 78, 96, 54};
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);

        }
    }
}
