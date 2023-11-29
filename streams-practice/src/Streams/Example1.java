package Streams;

import java.util.*;
import java.util.stream.Collectors;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class Example1 {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(111,1,2,3,4,20,6,7,8,10,11,4);
        var ans=numbers.stream().map(s->String.valueOf(s)).filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(ans);
        findDuplicateInthelist(numbers);

//        Given the list of integers, find the first element of the list using Stream functions?
        firstElementOftheList(numbers);

//        5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        findTotalNumberOfElements(numbers);
//        6. Given a list of integers, find the maximum value element present in it using Stream functions?

        maxinTheSTream(numbers);

    }

    private static void maxinTheSTream(List<Integer> numbers) {
        var ans=numbers.stream().max(Integer::compareTo).get();
        System.out.println(ans);
        
    }

    private static void findTotalNumberOfElements(List<Integer> numbers) {
        var ans =numbers.stream().count();
        System.out.println(ans);
    }

    private static void firstElementOftheList(List<Integer> numbers) {
        numbers.stream().findFirst().ifPresent(System.out::println);

    }

    private static void findDuplicateInthelist(List<Integer> numbers) {
        Set<Integer> dup= new HashSet<>();
        numbers.stream().filter(n->!dup.add(n))
                .forEach(System.out::println);
    }
}
