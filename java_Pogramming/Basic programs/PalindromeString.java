import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        if(str.equals(reverseString(str))){
            System.out.println(str+ " is a Palindrome String");
        }else{
            System.out.println(str+ " is not a Palindrom String");
        }
        
    }

    public static String reverseString(String str){
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            //System.out.print(str.charAt(i));
            rev+= str.charAt(i);
        }
        return rev;
    }
}
