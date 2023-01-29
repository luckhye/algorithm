package algorithm.baekjoon.solved.c1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class _2439 {

    // 문제 : https://www.acmicpc.net/problem/2438
    // ※ 주의 : NXN 큐브
    // 답 - https://developerin.tistory.com/32

    // 알게된점 - 역전 별찍기의 경우, NXN 큐브로 볼것
    // 알게된점 - 이중 for문시, 요소가 하나씩 돌므로 if로 분기가능

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer N = Integer.parseInt(s.nextLine());
        s.close();

        // 지정된 범위의 연속된 정수에서 스트림 생성
        IntStream.rangeClosed(1, N).forEach(i -> {
            IntStream.rangeClosed(1, N).forEach(j -> {
                if (j <= N - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        );
                System.out.println();
        });

    }

}



