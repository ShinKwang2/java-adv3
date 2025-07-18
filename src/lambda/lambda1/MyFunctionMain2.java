package lambda.lambda1;

import lambda.MyFunction;

public class MyFunctionMain2 {

    public static void main(String[] args) {
        MyFunction myFunction = (a, b) -> {
            return a + b;
        };

        int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
