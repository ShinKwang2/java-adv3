package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M3Anonymous {

    public static void main(String[] args) {
        // 익명 클래스로 1부터 N까지의 합
        Procedure p1 = new Procedure() {
            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += i;
                }
                System.out.println("[1부터 " + N + "까지 합] 결과: " + sum);
            }
        };

        // 2. 익명 클래스로 배열 정
        Procedure p2 = new Procedure() {
            @Override
            public void run() {
                int[] arr = {5, 3, 2, 1, 9, 10};
                System.out.println("origin: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("sorted: " + Arrays.toString(arr));
            }
        };

        measure(p1);
        measure(p2);

        measure(new Procedure() {
            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += 1;
                }
                System.out.println("[1부터 " + N + "까지 합] 결과: " + sum);
            }
        });
    }

    public static void measure(Procedure p) {
        long startNs = System.nanoTime();
        p.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }
}
