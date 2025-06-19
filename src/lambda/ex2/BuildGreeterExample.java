package lambda.ex2;

public class BuildGreeterExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수"를 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return (str) -> greeting + ", " + str;
    }

    public static void main(String[] args) {
        // 코드 작성

        System.out.println(buildGreeter("Hello").apply("Java"));
        System.out.println(buildGreeter("Hi").apply("Lambda"));
    }
}
