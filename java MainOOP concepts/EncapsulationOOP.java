

public class EncapsulationOOP {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.name= "chethana";
        std1.school = "Sirimavo";
        //std1.age= 18;  give an error by indicating The field Student.age is not visible
        std1.setAge(18);
        std1.address = "Kotte";

        System.out.println(std1.name +" age is "+std1.getAge());
        
    } 
}

class Student{
    //data fields
    String name;
    static String school;
    private int age;
    private double mark;
    String address;

    //default constructor
    public Student(){

    }

    //implment setter and getter methods to acces outside a class
    //age
    public void setAge(int age){
        if(age>18){
            System.out.println("Please provide valid age");
        }else{
            this.age = age;
        }
        
    }

    public int getAge(){
        return age;
    }

    //mark

    public void setMark(double mark){
        this.mark = mark;
    }

    public double getMark(){
        return mark;
    }




}