package lambda.start;

public class Ex0Main {

    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 시작");
    }

    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 시작");
    }

    public static void hello(String type) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + type);
        System.out.println("프로그램 시작");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
