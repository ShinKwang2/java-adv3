package stream.basic;

import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("원본 리스트: " + originList);

        List<Integer> filteredList = originList.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("originList = " + originList);
        System.out.println("filteredList = " + filteredList);

    }
}
