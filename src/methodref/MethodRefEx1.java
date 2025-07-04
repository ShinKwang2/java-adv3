package methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {
        // 1. 정적 메서드 참조
        Supplier<String> staticMethod1 = () -> Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting;

        System.out.println("staticMethod1 = " + staticMethod1.get());
        System.out.println("staticMethod2 = " + staticMethod2.get());

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Supplier<String> introduceMethod1 = () -> person.introduce();
        Supplier<String> introduceMethod2 = person::introduce;

        System.out.println("introduceMethod1 = " + introduceMethod1.get());
        System.out.println("introduceMethod2 = " + introduceMethod2.get());

        // 3 생성자 참조
        Supplier<Person> newPerson1 = () -> new Person();
        Supplier<Person> newPerson2 = Person::new;

        System.out.println("newPerson1 = " + newPerson1.get());
        System.out.println("newPerson2 = " + newPerson2.get());
    }
}
