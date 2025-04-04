class Vehicle {
    private static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = this.ownerName = ownerName;
        this.vehicleType = this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name          : " + ownerName);
            System.out.println("Vehicle Type        : " + vehicleType);
            System.out.println("Registration Number : " + registrationNumber);
            System.out.println("Registration Fee    : ₹" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "REG101");
        Vehicle v2 = new Vehicle("Bob", "Bike", "REG102");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(5500.0);
        System.out.println("Updated Registration Fee Applied:\n");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
    }
}
