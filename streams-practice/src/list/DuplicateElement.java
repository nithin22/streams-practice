package list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {


    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,2,3,4,5,6,7,8,8,1,3);
        dupliacteElementsInList(numbers);
    }

    private static void dupliacteElementsInList(List<Integer> numbers) {
        Set<Integer> set= new HashSet<>();
        var ans =numbers.stream().filter(s->!set.add(s)).collect(Collectors.toList());
        System.out.println(ans);
    }
}
