public class Polymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog(); // Polymorphic assignment

        animal1.makeSound(); // Output: Animal makes a sound
        animal2.makeSound(); // Output: Dog barks
    }
}

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the makeSound method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
