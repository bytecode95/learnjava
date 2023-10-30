public class ReverseNumber {
    public static void main(String[] args){
       int a = 12345;
        int n = 0;
        int reverseNumber = 0;
        while(a>0){
           n = a % 10;
           reverseNumber = reverseNumber*10 + n;
           
           a = a/10;
          
        }
        System.out.print(reverseNumber);

    }
    
}
