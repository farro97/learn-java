import javax.swing.text.Utilities;
import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        System.out.println("HR App Starts");

        Department department = new Department();

        System.out.println("Department: " + department.toString());

        department.addEmployee(101, "Ann", 1234.56);
        department.addEmployee(102, "Bob", 1200.34);
        department.addEmployee(103, "Ray", 1122.33);

        department.addEmployee(101, "Ann", 1234.56);
        department.addEmployee(102, "Bob", 1200.34);
        department.addEmployee(103, "Ray", 1122.33);

        department.addEmployee(101, "Ann", 1234.56);
        department.addEmployee(102, "Bob", 1200.34);
        department.addEmployee(103, "Ray", 1122.33);
        department.addEmployee(101, "Ann", 1234.56);
        department.addEmployee(102, "Bob", 1200.34);
        department.addEmployee(103, "Ray", 1122.33);
        ArrayList<Employee> employees = department.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.toString());
        }

        System.out.println("Total Salary: " + String.format("%.2f", department.getTotalSalary()));
        System.out.println("Average Salary: " + String.format("%.2f", department.getAverageSalary()));

        // get user by ID
        int userID = 1031;
        try {
            String employee = department.getEmployeeById(userID).toString();
            System.out.println(employee);
        } catch (NullPointerException e) {
            System.out.println("User Not Found!");
        }

    }
}
