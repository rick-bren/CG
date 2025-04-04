class Vehicle {

    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 5000.0; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car");
        Vehicle v2 = new Vehicle("Jane Smith", "Motorcycle");
        System.out.println("\n--- Vehicle 1 Details ---");
        v1.displayVehicleDetails();

        System.out.println("\n--- Vehicle 2 Details ---");
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("\n--- Updated Vehicle 1 Details ---");
        v1.displayVehicleDetails();

        System.out.println("\n--- Updated Vehicle 2 Details ---");
        v2.displayVehicleDetails();
    }
}
