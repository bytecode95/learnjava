//java does not support for multiple inheritance...but there is multi level inheritance

public class Inheritance {
    public static void main(String[] args){
        Animal A1 = new Animal();
        Animal D2 = new Animal();
        Dog D1 = new Dog();

    } 
}

//super class or parent class
class Animal{
    String name;
    String color;
    int age;
    int noOflegs;
    double weight;
    boolean isWalking;

    //default constructor
    public Animal(){

    }

    public void Eat(){

    }

    public void Sleeping(){

    }
}

//sub class or child class
class Dog extends Animal{
    String familyName;
    String breed;

    public void bark(){

    }

}