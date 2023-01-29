package algorithm.baekjoon.solved.c1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _2438 {

    // 문제 : https://www.acmicpc.net/problem/2438
    // ※ 주의 : foreach - stream (선출력 후계산) 이중포문 구조
    // 답 - https://nirsa.tistory.com/358

    // 알게된점 - 이중 for문시, map 내에 로그 출력안됨
            // map X map -> 안됨
            // map X for -> 안됨
    // 알게된점 - 이중 for문시, 선계산 이아닌 선출력
            // 선계산 후출력 -> 안됨
            // 후계산 선출력 -> 됨

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer N = Integer.parseInt(s.nextLine());
        s.close();

        // 지정된 범위의 연속된 정수에서 스트림 생성
        IntStream.rangeClosed(1, N).forEach(i -> {
            IntStream.rangeClosed(1, i).forEach(j ->
                    System.out.print("*"));
                System.out.println();
        });

    }

}



