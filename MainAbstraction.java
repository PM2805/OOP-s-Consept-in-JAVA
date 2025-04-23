// Abstract class representing a Vehicle (hiding implementation details)
abstract class Vehicle {
    abstract void brake();

    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}

// Concrete implementation (hidden details)
class Car extends Vehicle {

    void brake() {
        System.out.println("Car: Applying brakes...");
        // Hidden logic: hydraulic pressure, brake pads, etc.
    }
}
public class MainAbstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.brake();
    }
}
