
//Dynamic Polymorphism 
public class PolymorpshismOOP {
    public static void main(String[] args){
        Animal dog = new Dog();  //polymorphic assignment
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

    }
}

class Animal{
    String name;
    int age;


    void Eat(){

    }

    void Sleeping(){

    }

    void makeSound(){

    }
}

class Dog extends Animal{
    String type;
    String color;

    void run(){

    }

    @Override
    void makeSound(){
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal{
    String type;
    String color;

    void run(){

    }

    @Override
    void makeSound(){
        System.out.println("Cat Meow Meow");
    }
}
