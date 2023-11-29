package day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static List<Person> createPeopleList() {
        return Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 30, "Male"),
                new Person("Charlie", 22, "Male"),
                new Person("Diana", 28, "Female"),
                new Person("Eva", 35, "Female"),
                new Person("Frank", 40, "Male"),
                new Person("Grace", 32, "Female"),
                new Person("Harry", 26, "Male"),
                new Person("Ivy", 29, "Female"),
                new Person("Jack", 9, "Male")
        );
    }

    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        // Your task is to use Java 8 Streams API to solve the following problems:

        // Problem 1: Print the names of all females.
        System.out.println("Problem 1: Names of all females");
        var ans = people.stream().filter(s -> s.getGender().toLowerCase().equals("female")).map(Person::getName).collect(Collectors.toList());
        System.out.println(ans);
        // Your code here

        // Problem 2: Find the average age of all people.
        System.out.println("\nProblem 2: Average age of all people");
        // Your code here
         var a=people.stream().mapToInt(Person::getAge).average();
        System.out.println(a);

        // Problem 3: Create a list of names of people aged 30 and above.
        System.out.println("\nProblem 3: List of names of people aged 30 and above");
        // Your code here
        people.stream().filter(s->s.getAge()>30).map(Person::getName).forEach(System.out::println);

        // Problem 4: Find the oldest person in the list.
        System.out.println("\nProblem 4: Oldest person in the list");
        // Your code here
        var annnnns=people.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
        System.out.println(annnnns);

        // Problem 5: Create a comma-separated string of names of all people.
        System.out.println("\nProblem 5: Comma-separated names of all people");
        // Your code here
        var ans5=people.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(ans5);

        // Problem 6: Group people by gender.
        System.out.println("\nProblem 6: Group people by gender");
        // Your code here
        var ans6=people.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(ans6);

        // Problem 7: Count the number of people in each age group (20-29, 30-39, 40+).
        System.out.println("\nProblem 7: Count people in each age group");
        // Your code here
        var anssssssss=people.stream().collect(Collectors.groupingBy(person -> {
                    int age = person.getAge();
                    if (age >= 20 && age <= 29) {
                        return "20-29";
                    } else if (age >= 30 && age <= 39) {
                        return "30-39";
                    } else {
                        return "40+";
                    }
                },
                Collectors.counting()
        ));

        anssssssss.forEach((ageGroup, count) -> System.out.println(ageGroup + ": " + count));

        // Problem 8: Find the average age for each gender.
        System.out.println("\nProblem 8: Average age for each gender");
        // Your code here

        people.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.averagingInt(Person::getAge))).forEach((gender, averageAge) -> System.out.println(gender + ": " + averageAge));

        // Problem 9: Find the person with the shortest name.
        System.out.println("\nProblem 9: Person with the shortest name");
        // Your code here
        var an=people.stream().min(Comparator.comparingInt(person->person.getName().length())).stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(an);

        // Problem 10: Check if all people are adults (age 18 and above).
        System.out.println("\nProblem 10: Check if all people are adults");
        // Your code here

        var b=people.stream().allMatch(person -> person.getAge()>18);
        System.out.println(b);



    }
}

