package lambda.ex1;

import lambda.MyFunction;

public class M5HighOrderFunction {

    public static void main(String[] args) {

        MyFunction add = getOperation("add");
        System.out.println("add.apply(1, 2) = " + add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2));

        MyFunction nothing = getOperation("nothing");
        System.out.println("nothing.apply(1, 2) = " + nothing.apply(1, 2));

    }

    public static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
