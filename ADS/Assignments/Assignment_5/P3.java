package a5;
import java.util.*;
class Employee{
private static int employeeCount = 0;
private static double totalSalary = 0.0;// Static fields to keep track of the number of employees and total salary
private double salary;
private String name;
private int id;// Instance fields
public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        employeeCount++;
        totalSalary += salary;
    }// Constructor parameterized
//Getters and setters
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    totalSalary = totalSalary - this.salary + salary;
    this.salary = salary;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}
//Static method to raise the salary of all employees by a percentage
public static void raiseAllSalaries(double percentage, ArrayList<Employee> employees) {
 for(Employee emp:employees) {
       double newSalary = emp.salary*(1+percentage/100);
        emp.setSalary(newSalary);
    }
}

// Static method to calculate total salary expense
public static double calculateTotalSalaryExpense() {
    return totalSalary;
}

// Static method to update a single employee's salary
public static void updateEmployeeSalary(int id, double newSalary, ArrayList<Employee> employees) {
    for (Employee emp : employees) {
        if (emp.getId() == id) {
            emp.setSalary(newSalary);
            break;
        }
    }
}

}
class EmployeeUtil {
    // Method to accept a new employee record
public static void acceptRecord(ArrayList<Employee> employees) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter employee name: ");
 String name = sc.nextLine();
 System.out.print("Enter employee ID: ");
 int id = sc.nextInt();
 System.out.print("Enter employee salary: ");
 double salary = sc.nextDouble();
 employees.add(new Employee(name, id, salary));
 System.out.println("Employee record added.");
    }

    // Method to print all employee records
    public static void printRecords(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employee records available.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    // Method to display the menu
public static void displayMenu(ArrayList<Employee> employees) {
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("\nMenu:");
System.out.println("1. Add Employee Record");
System.out.println("2. Raise Salary of All Employees");
System.out.println("3. Calculate Total Salary Expense");
System.out.println("4. Update Employee Salary");
System.out.println("5. Print All Employee Records");
System.out.println("6. Exit");
System.out.print("Choose an option: "); int option = scanner.nextInt();
             switch (option) {
    case 1:
        acceptRecord(employees);
        break;  
    case 2:
        System.out.print("Enter percentage to raise salary: ");
        double percentage = scanner.nextDouble();
        Employee.raiseAllSalaries(percentage, employees);
        System.out.println("Salaries updated.");
        break;
    case 3:
        System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
        break;
    case 4:
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
        double newSalary = scanner.nextDouble();
        Employee.updateEmployeeSalary(id, newSalary, employees);
        System.out.println("Salary updated.");
        break;
    case 5:
        printRecords(employees);
        break;
    case 6:
        System.out.println("Exiting...");
        scanner.close();
        return;
    default:
        System.out.println("Invalid option, please try again.");
        break;
            }
        }
    }
}


public class Program3 {
public static void main(String[] args) {
	 // Creating a list to hold employee records
ArrayList<Employee> employees = new ArrayList<>();

    // Displaying the menu
    EmployeeUtil.displayMenu(employees);
}

}
