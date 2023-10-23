
public class Reversenumbers {
    public static void main(String[] args){
        int number = 1234;
        int temp = 0;
        int reverseNumber = 0;

        while(number > 0){
            System.out.println(number);
            temp = number%10;
            reverseNumber = reverseNumber*10 + temp;
            System.out.println(reverseNumber);
            number = number/10;   
        }
        System.out.println(reverseNumber);
    }
}
