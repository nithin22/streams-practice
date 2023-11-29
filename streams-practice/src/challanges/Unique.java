package challanges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unique {

    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 1);
        List<Integer> uniqueNumbers = numbers.stream()
                .filter(number -> numbers.indexOf(number) == numbers.lastIndexOf(number))
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        findSecondSmallesNumber(numbers);

    }

    private static void findSecondSmallesNumber(List<Integer> numbers) {
        var ans=numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(ans.get(1));
    }

}
