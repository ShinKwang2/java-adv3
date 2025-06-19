package lambda.ex3;

import java.util.List;
import java.util.function.BiFunction;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        // 코드 작성
        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적 +): " + sum);

        // 2. 곱 구하기 (초깃값 1, 곱셈 로직)
        // 코드 작성
        int multiple = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적 *): " + multiple);
    }

    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차함수
    static int reduce(List<Integer> list, int initial, BiFunction<Integer, Integer, Integer> reducer) {
        int result = initial;
        for (int num : list) {
            result = reducer.apply(result, num);
        }
        return result;
    }
}
