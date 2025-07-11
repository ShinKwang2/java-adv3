package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );


    }

    static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

    static List<String> ex2(List<Student> students){
        return List.of();
//        return MyStreamV3.of(students)
//                .filter(s -> s.getScore() >= 80)
//                .filter(s -> s.getName)
    }
}
