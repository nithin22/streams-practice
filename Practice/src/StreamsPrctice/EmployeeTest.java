package StreamsPrctice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

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

        howManyMaleAndFemaleEmployees(employeeList);
        printAllTheNamesOfDepartments(employeeList);
        avgAgeOfMaleAndFemaleEmployees(employeeList);
        highestPaidEmployee(employeeList);
        after2015(employeeList);
        numberOfEmployeesInEachDepartment(employeeList);
        averageSalaryOfEachDepartment(employeeList);
        youngestMaleInProductDevelopmentDepartment(employeeList);
        mostWorkingExperienceInOrganization(employeeList);
        howmanyMaleAndFemleinSalesAndMArketing(employeeList);
        avgSalaryOfMaleAndFemale(employeeList);
        namesOfEmployeesInEachDepartment(employeeList);
        avgSalaryAndTotalSalaryOfOrganiartion(employeeList);
    }

    private static void avgSalaryAndTotalSalaryOfOrganiartion(List<Employee> employeeList) {
        employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        DoubleSummaryStatistics ans = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(ans);
        System.out.println(ans.getAverage());
    }

    private static void namesOfEmployeesInEachDepartment(List<Employee> employeeList) {
        var ans=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(ans);
    }

    private static void avgSalaryOfMaleAndFemale(List<Employee> employeeList) {
        var ans =employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(ans);
    }

    private static void howmanyMaleAndFemleinSalesAndMArketing(List<Employee> employeeList) {
        var ans=employeeList.stream().filter(s->s.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(ans);
    }

    private static void mostWorkingExperienceInOrganization(List<Employee> employeeList) {
        var ans=employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
//        anotherWay
        var ans2=employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(ans);
        System.out.println(ans2);

    }

    private static void youngestMaleInProductDevelopmentDepartment(List<Employee> employeeList) {
        var ans=employeeList.stream().filter(s->s.getGender().equals("Male") && s.getDepartment().equals("Product Development")).min(
                Comparator.comparingInt(Employee::getAge)
        );
        System.out.println(ans);
    }

    private static void averageSalaryOfEachDepartment(List<Employee> employeeList) {
        var ans=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(ans);
    }

    private static void numberOfEmployeesInEachDepartment(List<Employee> employeeList) {
        var ans=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(ans);
    }

    private static void after2015(List<Employee> employeeList) {
        var ans=employeeList.stream().filter(s->s.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void highestPaidEmployee(List<Employee> employeeList) {
        var ans=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(ans);
    }

    private static void avgAgeOfMaleAndFemaleEmployees(List<Employee> employeeList) {
        var ans=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println(ans);

    }

    private static void printAllTheNamesOfDepartments(List<Employee> employeeList) {
        var ans=employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println(ans);

    }

    //    How many male and female employees are there in the organization?
//    Print the name of all departments in the organization?
//    What is the average age of male and female employees?
//    Get the details of highest paid employee in the organization?
//    Get the names of all employees who have joined after 2015?
//    Count the number of employees in each department?
//    What is the average salary of each department?
//    Get the details of youngest male employee in the product development department?
//    Query 3.9 : Who has the most working experience in the organization?
//    How many male and female employees are there in the sales and marketing team?
//    Query 3.12 : List down the names of all employees in each department?

//    What is the average salary of male and female employees?

//    What is the average salary and total salary of the whole organization?
    private static void howManyMaleAndFemaleEmployees(List<Employee> employeeList) {
        var ans=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(ans);
    }



}

