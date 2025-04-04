
class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. CGPA must be between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}

class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); 
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);  
        System.out.println("CGPA       : " + getCGPA());  
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 8.5);
        System.out.println("--- Student 1 Details ---");
        student1.displayStudentDetails();
        student1.setCGPA(9.0);
        System.out.println("\nUpdated Student 1 CGPA: " + student1.getCGPA());
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 8.7);
        System.out.println("\n--- Postgraduate Student Details ---");
        pgStudent.displayPostgraduateDetails();
    }
}
