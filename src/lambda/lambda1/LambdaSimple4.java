package lambda.lambda1;

public class LambdaSimple4 {

    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2;
        MyCall call2 = (value) -> value * 2;
        MyCall call3 = value -> value * 2; // 매개변수 1개일 때, () 생략 가능

        System.out.println("call3 = " + call3.call(3));
    }

    interface  MyCall {
        int call(int value);
    }
}
