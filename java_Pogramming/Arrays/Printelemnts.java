package Arrays;

public class Printelemnts {
    public static void main(String[] args){
        int[] num = {23, 45, 37, 98, 56, 105, 120, 456};
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        //foreach -- enahnced for loop for travesal over array
        for(int element: num){
            System.out.println(element);
        }
    }
}
