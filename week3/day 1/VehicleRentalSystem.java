
import java.util.*;

// Interface for insurable vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters (encapsulation)
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Polymorphic display method
    public void printRentalDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate (per day): ₹" + rentalRate);
        System.out.println("Rental Cost for " + days + " days: ₹" + calculateRentalCost(days));
        if (this instanceof Insurable) {
            Insurable ins = (Insurable) this;
            System.out.println("Insurance: ₹" + ins.calculateInsurance());
            System.out.println("Insurance Details: " + ins.getInsuranceDetails());
        } else {
            System.out.println("No Insurance Available");
        }
        System.out.println("------------------------------------");
    }
}

// Car class
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 2000.0;
    }

    public String getInsuranceDetails() {
        return "Policy No: " + maskPolicy(insurancePolicyNumber) + " (Fixed ₹2000)";
    }

    private String maskPolicy(String policy) {
        return "****" + policy.substring(policy.length() - 4);
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500.0;
    }

    public String getInsuranceDetails() {
        return "Policy No: " + maskPolicy(insurancePolicyNumber) + " (Fixed ₹500)";
    }

    private String maskPolicy(String policy) {
        return "****" + policy.substring(policy.length() - 4);
    }
}

// Truck class
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // Extra handling fee
    }
}

// Main class to test
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("TN09AB1234", 1500, "CAR20231234"));
        fleet.add(new Bike("TN10XY4567", 500, "BIKE87654321"));
        fleet.add(new Truck("TN11TR9876", 2500));

        int days = 5;
        System.out.println("---- Vehicle Rental Summary for " + days + " Days ----");
        for (Vehicle v : fleet) {
            v.printRentalDetails(days);
        }
    }
}

