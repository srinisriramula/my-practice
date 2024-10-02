import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSalaryExample {
    
    public static void main(String[] args) {
        List<EmployeeEx> employees = Arrays.asList(
                new EmployeeEx("John", 5000),
                new EmployeeEx("Alice", 6000),
                new EmployeeEx("Bob", 4500),
                new EmployeeEx("Emily", 7000),
                new EmployeeEx("David", 5500)
        );
        
        EmployeeEx employeeWithHighestSalary = getEmployeeWithHighestSalary(employees);
        System.out.println("Employee with the highest salary: " + employeeWithHighestSalary);
    }
    
    public static EmployeeEx getEmployeeWithHighestSalary(List<EmployeeEx> employees) {
        return employees.stream()
                .max(Comparator.comparingInt(EmployeeEx::getSalary))
                .orElse(null);
    }
}

class EmployeeEx {
    private String name;
    private int salary;
    
    public EmployeeEx(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
