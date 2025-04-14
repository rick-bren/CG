
// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: Getters and setters
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);
}

// Car class extends Vehicle
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Not Available";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Bike class extends Vehicle
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Not Available";
    }

    @Override
    public double calculateFare(double distance) {
        // Bikes may have a different rate calculation logic
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Auto class extends Vehicle
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Not Available";
    }

    @Override
    public double calculateFare(double distance) {
        // Autos may have a different rate calculation logic
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Main class to test Ride-Hailing Application
public class RideHailingApp {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("V101", "John", 10);
        Vehicle bike = new Bike("V102", "Alice", 5);
        Vehicle auto = new Auto("V103", "Bob", 8);

        // Update location for each vehicle
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("City Center");
        ((GPS) auto).updateLocation("Airport");

        // Create an array of vehicles
        Vehicle[] vehicles = {car, bike, auto};

        // Demonstrating polymorphism by calculating fare for different vehicle types
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            double distance = 15.0; // example distance
            System.out.println("Fare for " + vehicle.getClass().getSimpleName() + ": ₹" + vehicle.calculateFare(distance));
            System.out.println("-----------------------------------");
        }
    }
}



