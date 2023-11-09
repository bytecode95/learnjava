//static keyword is used. because main method will be invoked without creating an object
//void is the return type of a method
//String[] args - command line argument - CLA - this string array(collection of string)
//what ever we write in a terminal will be stored in string array
public class Args {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments provided:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
