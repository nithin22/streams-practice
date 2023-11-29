package persons;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*You are given a list of Person objects representing individuals with their names and ages.
        Write a Java program using Streams
        API to find and print the names of all adults (persons aged 18 or older) in alphabetical order.*/

public class AdultsNames {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 18),
                new Person("Charlie", 30),
                new Person("David", 17),
                new Person("Eve", 22)
        );

        // Your code here

        var adultNames=people.stream().filter(s->s.getAge()>=18).map(Person::getName).collect(Collectors.toList());

        /*You are given a list of Person objects representing individuals with their
        names and ages. Write a Java program using Streams API to find and print the names of all
        adults (persons aged 18 or older) who have a name starting with a vowel, sorted in
        descending order of their ages.*/

        List<String> resultNames = people.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> "aeiouAEIOU".indexOf(person.getName().charAt(0)) >= 0)
                .sorted((person1, person2) -> Integer.compare(person2.getAge(), person1.getAge()))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(resultNames);

        System.out.println("Names of adults in alphabetical order: " + adultNames);
    }
}
