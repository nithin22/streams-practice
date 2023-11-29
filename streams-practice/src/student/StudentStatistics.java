package student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStatistics {

//    Find the student with the highest average grade.
    public static Student findStudentWithHighestAverage(List<Student> students) {
        // Your code here
        return students.stream().max(Comparator.comparingDouble(student->student.getGrades().stream().mapToInt(Integer::intValue).average().orElse(0.0))).orElse(null);
    }
//    Group students by age and calculate the average grade for each age group.

    public static Map<Integer, Double> averageGradeByAge(List<Student> students) {
        // Your code here
        return students.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.averagingDouble(student->student.getGrades().stream().mapToInt(Integer::intValue).average().orElse(0.0))));
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                // Populate with sample Student objects
                new Student("Alice", 20, Arrays.asList(85, 90, 92)),
                new Student("Bob", 21, Arrays.asList(78, 82, 88)),
                new Student("Charlie", 20, Arrays.asList(90, 95, 87)),
                new Student("David", 22, Arrays.asList(76, 85, 80)),
                new Student("Eva", 21, Arrays.asList(88, 92, 94)),
                new Student("Frank", 22, Arrays.asList(75, 79, 83)),
                new Student("Grace", 20, Arrays.asList(94, 97, 91))
        );

        Student highestAverageStudent = findStudentWithHighestAverage(students);
        System.out.println("Student with the highest average grade: " + highestAverageStudent.getName());

        Map<Integer, Double> averageGradeByAge = averageGradeByAge(students);
        System.out.println("\nAverage Grade by Age:");
        averageGradeByAge.forEach((age, avgGrade) ->
                System.out.println("Age " + age + ": " + avgGrade)
        );
    }
}
