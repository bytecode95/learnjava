
public class OOP {
    public static void main(String[] args){
        //through reference
        Student std1 = new Student();
        std1.name = "Chethana";
        std1.address = "Kotte";
        std1.grade = "11B";
        std1.age = 16;
        std1.mark = 78.5;
        std1.isPassed = true;

        System.out.println(std1.name);
        System.out.println(std1.grade);

        //default constructor
        Student std2 = new Student();



        //Parameterized constructor
        Student std3 = new Student("John", "London", "12B", 20, 89.5, true);
        System.out.println(std3.name);



    }
}

class Student{
    String name;
    String address;
    static String grade;
    int age;
    double mark;
    boolean isPassed;

    //instance block -- default values for instance variables
    {
        name = null;
        address = null;
        age = 0;
        mark = 0.0;
        isPassed =  false;
    }

    static{
        grade = null;
    }

    //default constructor
    public Student(){

    }

    //parameterized constructor & method overloading
    public Student(String name, String address, String grade, int age, double mark, boolean isPassed){
        this.name = name;
        this.address = address;
        this.grade = grade;
        this.age = age;
        this.mark = mark;
        this.isPassed = isPassed;

    }


    public void study(){
        write();
    }

    public static void write(){

    }
}
