package parallel;

import util.MyLogger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.*;

public class ParallelMain5 {

    public static void main(String[] args) throws InterruptedException {
        // 병렬 수준 3으로 제한
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");
        //System.out.println("ForkJoinPool.commonPool() = " + ForkJoinPool.commonPool());

        // 요청 풀 추가
        ExecutorService requestPool = Executors.newFixedThreadPool(100);
        int nThreads = 3; // 1, 2, 3, 10, 20
        for (int i = 1; i <= nThreads; i++) {
            String requestName = "request" + i;
            requestPool.submit(() -> logic(requestName));
            Thread.sleep(100); // 스레드 순서를 위해 약간 대기
        }
        requestPool.close();
    }

    private static void logic(String requestName) {
        log("[" + requestName + "] START");
        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 4)
                .parallel() // 주석 처리가 더 빨리 처리될 수 있음
                .map(i -> HeavyJob.heavyTask(i, requestName))
                .reduce(0, (a, b) -> a + b);

        long endTime = System.currentTimeMillis();
        log("[" + requestName + "] time: " + (endTime - startTime) + "ms, sum: " + sum);
    }
}
