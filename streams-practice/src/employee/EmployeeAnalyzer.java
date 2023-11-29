package employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAnalyzer {

    public static void main(String[] args) {
        List<Employee> employeesData= Arrays.asList(
                new Employee("Alice", "Engineering", 80000, 6),
                new Employee("Bob", "Sales", 70000, 4),
                new Employee("Charlie", "Engineering", 90000, 8),
                new Employee("David", "HR", 75000, 5),
                new Employee("Eva", "Sales", 72000, 3),
                new Employee("Frank", "HR", 85000, 7)
        );

        /*Find the average salary of all employees.
                Identify the highest-paid employee in each department.
        Create a list of employee names who have more than 5 years of experience and earn a salary greater than $70,000.*/
        findAvgSalaryOfAllEmployees(employeesData);
        highestPaidEmployeeInEachDepartment(employeesData);
        employeeNameswithExperienceandSalaryGreaterThan(employeesData);


    }

    private static void employeeNameswithExperienceandSalaryGreaterThan(List<Employee> employeesData) {
        var ans=employeesData.stream().filter(s->s.getYearsOfExperience()>5).filter(s->s.getSalary()>70000).map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employee Name with 5years of experiecne an salry greater "+ans);
    }

    private static void highestPaidEmployeeInEachDepartment(List<Employee> employeesData) {
       var ans= employeesData.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Height Salary in each Depertment"+ans);
    }

    private static void findAvgSalaryOfAllEmployees(List<Employee> employeesData) {
        var ans=employeesData.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        var anssss = employeesData.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("The average Salary is "+anssss);
    }
}
