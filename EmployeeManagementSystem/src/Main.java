import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Display Average Salary");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(new Employee(id, name, salary));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    manager.removeEmployee(removeId);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new Salary: ");
                    double newSalary = sc.nextDouble();
                    manager.updateEmployee(updateId, newName, newSalary);
                    break;

                case 4:
                    manager.displayEmployees();
                    break;

                case 5:
                    manager.displayAverageSalary();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
