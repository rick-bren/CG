class Course {

    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "Default Institute";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : ₹" + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}

public class OnlineCourseManager {
    public static void main(String[] args) {
        Course.updateInstituteName("TechNova Academy");
        Course c1 = new Course("Java Programming", 8, 4999);
        Course c2 = new Course("Web Development", 10, 5999);
        System.out.println("\n--- Course 1 Details ---");
        c1.displayCourseDetails();
        System.out.println("\n--- Course 2 Details ---");
        c2.displayCourseDetails();
    }
}
