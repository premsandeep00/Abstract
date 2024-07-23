package multipleinheritance;


//Interface 1
interface CanFly {
 void fly();
}

//Interface 2
interface CanSwim {
 void swim();
}

//Implementing both interfaces
class Duck implements CanFly, CanSwim {
 public void fly() {
     System.out.println("The duck flies.");
 }
 
 public void swim() {
     System.out.println("The duck swims.");
 }
}

public class Main {
 public static void main(String[] args) {
     Duck myDuck = new Duck();
     myDuck.fly();  // Implemented method
     myDuck.swim(); // Implemented method
 }
}
