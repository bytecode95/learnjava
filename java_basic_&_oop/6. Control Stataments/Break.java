import java.util.Scanner;
public class Break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dbUsername = "admin";
        int dbPassword = 1234;

        for(int i=0; i<5; i++){
            System.out.print("Enter your username: ");
            String name = sc.next();
            System.out.print("Enter your password: ");
            int password = sc.nextInt();

            if(name.equals(dbUsername) && password==dbPassword){
                System.out.println("Login Sucess!");
                break;
            }else if(name.equals(dbUsername) && password!=dbPassword){
                System.out.println("Wrong password! Try again...");
            }else if(!name.equals(dbUsername) && password==dbPassword){
                System.out.println("Wrong username! Try again...");
            }else{
                System.out.println("Wrong username && password! Try again...");
            }
        }
        sc.close();
        System.out.println("System locked please try again later..");


    }
}
