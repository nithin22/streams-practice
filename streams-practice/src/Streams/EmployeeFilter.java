package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*You have a list of employee objects with the following attributes: id, name, age, and
        salary. Write a Java program that filters the list of employees and creates a new
        list of employee names of employees who are older than 30 and earn more than $50,000.*/

    public class EmployeeFilter {
        public static List<String> filterAndTransform(List<Employee> employees) {
            return employees.stream().filter(s->s.getAge()>30).filter(s->s.getSalary()>50000).map(Employee::getName).collect(Collectors.toList());
            // Your code here
        }

        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1, "Alice", 35, 60000.0),
                    new Employee(2, "Bob", 28, 45000.0),
                    new Employee(3, "Charlie", 40, 75000.0),
                    new Employee(4, "David", 32, 55000.0),
                    new Employee(5, "Eve", 25, 40000.0)
            );

            List<String> result = filterAndTransform(employees);

            System.out.println("Filtered and transformed employee names: " + result);
        }
    }
