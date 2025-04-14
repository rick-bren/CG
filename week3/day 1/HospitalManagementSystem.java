
// Interface for medical record functionality
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

// Abstract class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }

    // Encapsulation: Getters and setters
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getMedicalHistory() { return medicalHistory; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }

    // Concrete method to get patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + (medicalHistory.isEmpty() ? "No records available" : medicalHistory));
    }

    // Abstract method to calculate the medical bill
    public abstract double calculateBill();
}

// InPatient class extends Patient
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double dailyRate;
    private String medicalRecord;

    public InPatient(int patientId, String name, int age, int numberOfDays, double dailyRate) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
        this.medicalRecord = "";
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        medicalRecord = record;
        setMedicalHistory(record);
    }

    @Override
    public String viewRecords() {
        return medicalRecord;
    }
}

// OutPatient class extends Patient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalRecord;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecord = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecord = record;
        setMedicalHistory(record);
    }

    @Override
    public String viewRecords() {
        return medicalRecord;
    }
}

// Main class to test Hospital Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patients (InPatient and OutPatient)
        Patient inPatient = new InPatient(101, "John Doe", 35, 5, 2000);
        Patient outPatient = new OutPatient(102, "Jane Smith", 28, 500);

        // Adding medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
        ((MedicalRecord) outPatient).addRecord("Consultation for fever.");

        // Demonstrating polymorphism by processing both patient types and printing their details
        Patient[] patients = {inPatient, outPatient};

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: ₹" + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                MedicalRecord recordPatient = (MedicalRecord) patient;
                System.out.println("Medical Record: " + recordPatient.viewRecords());
            }
            System.out.println("-----------------------------------");
        }
    }
}



