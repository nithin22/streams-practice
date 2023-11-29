package day1.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Filtering Employees:
//Filter out the employees who are older than 30 years.

//Create a list of strings containing the names of all employees.

//Sort the employees based on their salary in descending order.

//Find the average salary of employees.
//Group the employees by their age.

//Finding the Highest Earner:
public class TestingEmployee {

    public static void main(String[] args) {
        List<Employee> employeesData=new ArrayList<>();
        employeesData.add(new Employee("Nithin", 18, 2000));
        employeesData.add(new Employee("Alice", 35, 5000));
        employeesData.add(new Employee("Bob", 28, 4000));
        employeesData.add(new Employee("Charlie", 22, 3000));
        employeesData.add(new Employee("David", 40, 6000));
        employeesData.add(new Employee("Eva", 32, 5500));
        filterEmployeesData(employeesData);
        listOfStringsContainingAllEmployeesData(employeesData);
        sortDescendingOrderBAsedOnEmployeeSalary(employeesData);
        avgSalaryOfEmployees(employeesData);
        groupingEmployesByTheirAge(employeesData);
        findTheHeighestEarner(employeesData);

    }

    private static void findTheHeighestEarner(List<Employee> employeesData) {
        var ans=employeesData.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(ans);
    }

    private static void groupingEmployesByTheirAge(List<Employee> employeesData) {
        var ans=employeesData.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(ans);
    }

    private static void avgSalaryOfEmployees(List<Employee> employeesData) {
        var ans=employeesData.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(ans);
    }

    private static void sortDescendingOrderBAsedOnEmployeeSalary(List<Employee> employeesData) {
        var ans =employeesData.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void listOfStringsContainingAllEmployeesData(List<Employee> employeesData) {
        var ans= employeesData.stream().map(s->s.getName()).collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void filterEmployeesData(List<Employee> employeesData) {
        var ans= employeesData.stream().filter(s->s.getAge()>30).collect(Collectors.toList());
        System.out.println("Employees Age Greater than 30 "+ans);
    }


}
