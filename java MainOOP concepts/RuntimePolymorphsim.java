public class RuntimePolymorphsim {
    public static void main(String[] args){
        MathOperations math = new MathOperations();
        math.add(3, 5);
        math.add(3.0, 5.0);
        math.add(3,5,8);


    }
}

class MathOperations{

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

}