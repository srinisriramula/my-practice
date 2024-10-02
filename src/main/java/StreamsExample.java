import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    private static ArrayList<Employee> employeeList;

    public static void main(String[] args) {

        initiaze();
        Optional highestEmploye = employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee :: getSalary)));

        //employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee :: getSalary)));
        System.out.println(highestEmploye);
//       Map<String, Long> noOfEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
//
//       //System.out.println(noOfEmployees);
//       Stream<String> allDepts = employeeList.stream(). map(Employee :: getDepartment).distinct();
//       //allDepts.forEach(System.out :: println);
//
//        Map<String, Double> averageAgeEmp = employeeList.stream().collect(Collectors.groupingBy( (Employee :: getGender), Collectors.averagingInt(Employee :: getAge)));
//        //System.out.println(averageAgeEmp);
//
//        Optional highestEmploye = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
//        //System.out.println(highestEmploye);
//
//        Stream filter = employeeList.stream().filter( e -> e.yearOfJoining > 2015).map(Employee :: getName);
//        //filter.forEach(System.out :: println);
//
//        Map<String, Long> allDeptCount =  employeeList.stream().collect(Collectors.groupingBy((Employee :: getDepartment), Collectors.counting()));
//        //System.out.println(allDeptCount);
//
//        Map<String, Double> avgSalDeptCount = employeeList.stream().collect(Collectors.groupingBy((Employee :: getDepartment), Collectors.averagingDouble(Employee :: getSalary)));
//        //System.out.println(avgSalDeptCount);
//
//        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =  employeeList.stream().filter(employee -> employee.gender.equalsIgnoreCase("Male") && employee.department.equalsIgnoreCase("Product Development"))
//                .collect(Collectors.minBy(Comparator.comparingDouble(Employee :: getSalary)));
//
//        //System.out.println(youngestMaleEmployeeInProductDevelopmentWrapper);
//        Optional<Employee> expEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee :: getYearOfJoining)).findFirst();
//        System.out.println(expEmployee);
    }

    private static void initiaze() {
       employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }
}
