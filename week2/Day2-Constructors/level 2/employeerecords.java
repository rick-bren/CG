class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID  : " + employeeID);
        System.out.println("Department   : " + department);
        System.out.println("Salary       : ₹" + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID  : " + employeeID);
        System.out.println("Department   : " + department);
        System.out.println("Salary       : ₹" + getSalary());
    }
}

public class employeerecords {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "IT", 75000);
        System.out.println("--- Employee 1 Details ---");
        employee1.displayEmployeeDetails();

        Manager manager1 = new Manager(102, "HR", 90000);
        System.out.println("\n--- Manager 1 Details ---");
        manager1.displayManagerDetails();

        manager1.setSalary(95000);
        System.out.println("\nUpdated Salary for Manager 1: ₹" + manager1.getSalary());
    }
}
