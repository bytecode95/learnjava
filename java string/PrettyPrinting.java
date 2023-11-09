public class PrettyPrinting {
    public static void main(String[] args){
        float f = 453.125647f;
        //% -placeholder
        System.out.printf("Formated String: %.2f", f);  //3.141592653589793
        System.out.println(" ");
        System.out.printf("Pi %.3f",Math.PI);  //Pi 3.142
        System.out.println(" ");
        System.out.printf("Hello I am %s and I am %s", "chethana", "cool");  //Hello I am chethana and I am cool
    }
}
