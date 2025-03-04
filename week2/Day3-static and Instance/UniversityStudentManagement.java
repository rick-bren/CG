class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = this.name = name;
        this.rollNumber = rollNumber;
        this.grade = this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University     : " + universityName);
            System.out.println("Name           : " + name);
            System.out.println("Roll Number    : " + rollNumber);
            System.out.println("Grade          : " + grade);
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public static void setUniversityName(String name) {
        universityName = name;
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        s2.updateGrade("A+");
        System.out.println("After Grade Update:\n");
        s2.displayStudentDetails();
        System.out.println();

        Student.displayTotalStudents();
    }
}
