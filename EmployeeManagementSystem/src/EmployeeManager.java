import java.util.ArrayList;
public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    // Add new employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    // Remove employee by ID
    public void removeEmployee(int id) {
        boolean removed = employees.removeIf(emp -> emp.getId() == id);
        if (removed)
            System.out.println("Employee removed successfully.");
        else
            System.out.println("Employee not found.");
    }

    // Update employee details
    public void updateEmployee(int id, String name, double salary) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                emp.displayEmployee();
            }
        }
    }

    // Calculate average salary
    public void displayAverageSalary() {
        if (employees.isEmpty()) {
            System.out.println("No employees to calculate average salary.");
            return;
        }

        double total = 0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        System.out.printf("Average Salary: %.2f\n", total / employees.size());
    }
}

