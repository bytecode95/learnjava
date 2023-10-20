public class Main {
    public static void main(String[]args){
        //Unary Operator
        int x = 1;
        x++;
        System.out.println(x);
        
        int y = 1;
        ++y;
        System.out.println(y);

        //Arithmetic operators
        int a = 3;
        int b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);

        //Relational && bitwise/Logical Operators
        //>, <, >=, <=
        //&&, ||
        if(a>b && b<1){
            System.out.println("a>b");
        }else{
            System.out.println("argument was not sucessful");
        }


    }
}
