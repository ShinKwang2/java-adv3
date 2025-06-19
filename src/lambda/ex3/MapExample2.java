package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExample2 {

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 1. 대문자 변환
        // 코드 작성
        List<String> uppers = map(words, s -> s.toUpperCase());
        System.out.println("대문자 변환 결과: " + uppers);

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        // 코드 작성
        List<String> decorated = map(words, s -> "***" + s + "***");
        System.out.println("특수문자 데코 결과: " + decorated);
    }

    static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> result = new ArrayList<>();
        for (String str: list) {
            result.add(func.apply(str));
        }
        return result;
    }

}
