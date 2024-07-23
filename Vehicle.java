// Abstract class
public class Vehicle {
	// Abstract method (does not have a body)
    abstract void start();

    // Non-abstract method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete subclass
class Car extends Vehicle {
    // Providing implementation for the abstract method
    @Override
    void start() {
        System.out.println("Car is starting.");
    }
}

// Another concrete subclass
class Bike extends Vehicle {
    // Providing implementation for the abstract method
    @Override
    void start() {
        System.out.println("Bike is starting.");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Vehicle reference, Car object
        myCar.start(); // Calls the implementation in Car
        myCar.stop(); // Calls the method in Vehicle

        Vehicle myBike = new Bike(); // Vehicle reference, Bike object
        myBike.start(); // Calls the implementation in Bike
        myBike.stop(); // Calls the method in Vehicle
    }
}

  
