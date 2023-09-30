import java.text.DecimalFormat;
import java.util.ArrayList;

public class Department {
    private final ArrayList<Employee> employees
            = new ArrayList<>();
    private final int max = 10;

    public void addEmployee(int id, String name, Double salary) {
        Employee employee = new Employee(id, name, salary);
        if (size() >= max) {
            throw new UnsupportedOperationException("Maximum Size "
                    + max + " reached");
        } else {
            employees.add(employee);
        }

    }
    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    public int size() {return employees.size();}

    public Employee getEmployeeById(int id) {
        return employees.stream()
                .filter(t -> t.getId() == id)
                .findFirst().orElse(null);
    }

    public double getTotalSalary() {
        Double total = 0.0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        return total;
    }
    public double getAverageSalary() {
        Double avgSalary = 0.0;
        for (Employee employee : employees) {
            avgSalary += employee.getSalary();
        }
        return avgSalary / size();
    }
    @Override
    public String toString() {
        return "Department Education";
    }
}
