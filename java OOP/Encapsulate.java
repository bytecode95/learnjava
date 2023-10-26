public class Encapsulate{
    public static void main(String[] args){

        Student std1 = new Student( "Kotte", "Sirimavo","S001", 16, true);
        //System.out.println(std1.name); can not access private variables like this field name is not visible
        std1.setName("Chethana");
        System.out.println(std1.getName());
        std1.setMark(85.5);
        System.out.println(std1.getMark());

        System.out.println(std1.address);
    }
}

class Student{
    //attributes
    private String name;
    String address;
    static String school;
    String id;
    int age;
    private double mark;
    boolean isPassed;

    //instance block
    {
        name = null;
        address = null;
        id = null;
        age = 0;
        mark = 0.0;
        isPassed = false;
    }

    //static block
    static{
        school = null;
    }

    //constructor
    public Student( String address, String school, String id, int age, boolean isPassed){
        
        this.address = address;
        this.school = school;
        this.id = id;
        this.age =age;
        this.isPassed = isPassed;
    }
    //setter method
    public void setName(String name){
        this.name = name;
    }
    public void setMark(double mark){
        this.mark = mark;
    }

    //getter method
    public String getName(){
        return name;
    }

    public double getMark(){
        return mark;
    }

}