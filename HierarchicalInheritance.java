package hirechical;

//Superclass
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Subclass 1
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Subclass 2
class Cat extends Animal {
 void meow() {
     System.out.println("The cat meows.");
 }
}

public class Main {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     Cat myCat = new Cat();
     myDog.eat();   // Inherited from Animal
     myDog.bark();  // Method of Dog
     myCat.eat();   // Inherited from Animal
     myCat.meow();  // Method of Cat
 }
}
