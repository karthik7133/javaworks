package practise;
import java.util.*;
public class ex_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance to travel (in km): ");
        int distance = sc.nextInt();

        Car car = new Car("C101", "Honda City", 40, 120);
        Truck truck = new Truck("T201", "Volvo Truck", 150, 80);
        Motorcycle bike = new Motorcycle("M301", "Yamaha R15", 12, 100);

        System.out.println("\n--- Car ---");
        car.startEngine();
        car.stopEngine(distance);

        System.out.println("\n--- Truck ---");
        truck.startEngine();
        truck.stopEngine(distance);

        System.out.println("\n--- Motorcycle ---");
        bike.startEngine();
        bike.stopEngine(distance);

        sc.close();
    }
	
}
class vehicle{
	String vehicleid;
	String vehiclename;
	double fuelcapacity;
	double maxspeed;
	public void startEngine() {
		
	}
}
class Vehicle {
    String vehicleId;
    String vehicleName;
    double fuelCapacity;
    double maxSpeed;

    Vehicle(String vehicleId, String vehicleName, double fuelCapacity, double maxSpeed) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
    }

    void startEngine() {
        System.out.println(vehicleName + " engine started.");
    }

    void stopEngine(int distance) {
        double time = distance / maxSpeed;
        System.out.println(vehicleName + " stopped. Time taken to travel " + distance + " km: " + time + " hours");
    }
}

// Derived class - Car
class Car extends Vehicle {
    Car(String vehicleId, String vehicleName, double fuelCapacity, double maxSpeed) {
        super(vehicleId, vehicleName, fuelCapacity, maxSpeed);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine(int distance) {
        double time = distance / maxSpeed;
        System.out.println("Car stopped. Time taken: " + time + " hours");
    }
}

// Derived class - Truck
class Truck extends Vehicle {
    Truck(String vehicleId, String vehicleName, double fuelCapacity, double maxSpeed) {
        super(vehicleId, vehicleName, fuelCapacity, maxSpeed);
    }

    @Override
    void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    void stopEngine(int distance) {
        double time = distance / maxSpeed;
        System.out.println("Truck stopped. Time taken: " + time + " hours");
    }
}

// Derived class - Motorcycle
class Motorcycle extends Vehicle {
    Motorcycle(String vehicleId, String vehicleName, double fuelCapacity, double maxSpeed) {
        super(vehicleId, vehicleName, fuelCapacity, maxSpeed);
    }

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    void stopEngine(int distance) {
        double time = distance / maxSpeed;
        System.out.println("Motorcycle stopped. Time taken: " + time + " hours");
    }
}
