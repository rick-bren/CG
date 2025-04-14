import java.util.ArrayList;
import java.util.List;
// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    // Abstract method for salary calculation
    public abstract double calculateSalary();
    // Concrete method to display details
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}
// Interface for Department management
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
// Full-time Employee subclass
class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary
    }
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
// Part-time Employee subclass
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;
    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
// Main class to test the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 50000);
        emp1.assignDepartment("HR");
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 200, 20);
        emp2.assignDepartment("IT");
        employees.add(emp1);
        employees.add(emp2);
        // Display employee details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("---------------------");
        }
    }
}
