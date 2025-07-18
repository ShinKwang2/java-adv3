package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        List<Integer> evenNumbers = filter(numbers, evenPredicate);
        System.out.println("evenNumbers = " + evenNumbers);

        Predicate<Integer> oddPredicate = n -> n % 2 != 0;
        List<Integer> oddNumbers = filter(numbers, oddPredicate);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }
}
