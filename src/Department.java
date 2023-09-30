import java.util.ArrayList;

public class Department {
    private final ArrayList<Employee> employees
            = new ArrayList<>();
    private final int maxSize = 10;

    public void addEmployee(int id, String name, Double salary) {
        Employee employee = new Employee(id, name, salary);
        if (size() >= maxSize) {
            System.out.println("MAX " + maxSize + " users only!");
//            throw new UnsupportedOperationException("Maximum Size "
//                    + maxSize + " reached");
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
        Double total = 0.0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total / size();
    }
    @Override
    public String toString() {
        return "Department Education";
    }
}
