class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = this.name = name;
        this.id = id;
        this.designation = this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name : " + companyName);
            System.out.println("Employee ID  : " + id);
            System.out.println("Name         : " + name);
            System.out.println("Designation  : " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Developer");
        Employee emp2 = new Employee("Bob", 102, "Manager");

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();

        Employee.displayTotalEmployees();
    }
}
