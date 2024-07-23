package singleinheristance;

public class Animal {

    // Field
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    // Additional field
    String breed;

    // Constructor
    Dog(String name, String breed) {
        // Call the constructor of the superclass (Animal)
        super(name);
        this.breed = breed;
    }

    // Method specific to Dog
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class main{
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        
        // Call methods
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Specific to Dog
    }
}
