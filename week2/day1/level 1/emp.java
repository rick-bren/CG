class emp {
    String name;
    int id;
    double salary;

    emp(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
void displayDetails() {
        System.out.println("Name: " + name + ", id: " + id + ", salary: " + salary);
    }

    public static void main(String[] args) {
        emp student = new emp("Alice", 101, 599332);
        student.displayDetails();  // Output: Name: Alice, Roll Number: 101, Marks: 89.5
    }
}
