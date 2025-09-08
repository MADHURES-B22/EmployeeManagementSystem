public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    // Display employee info
    public void displayEmployee() {
        System.out.printf("ID: %d | Name: %s | Salary: %.2f \n", id, name, salary);
    }
}