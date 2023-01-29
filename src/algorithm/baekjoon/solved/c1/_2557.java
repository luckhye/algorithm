package algorithm.baekjoon.solved.c1;

import sun.jvm.hotspot.utilities.IntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2557 {

    // 문제 : https://www.acmicpc.net/problem/2562
    // ※ 주의 : creating structure, 위치찾기는 List 특화
    // 답 - https://developerin.tistory.com/32

    // 알게된점 - 받아오는값은 int[] (scan.nextInt();)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // data
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(s.nextLine());
        arr[1] = Integer.parseInt(s.nextLine());
        arr[2] = Integer.parseInt(s.nextLine());

        int gob = arr[0] * arr[1] * arr[2];
        System.out.println(gob);

        // 기준 data
        int[] result = new int[10];

        // 분류
        Arrays.stream(String.valueOf(gob).split(""))
//
                .map( i -> {
                        int intI = Integer.parseInt(i);
                        result[intI] += result[intI] + 1;
                        return result[intI];
                });

        //출력
        Arrays.stream(result)
                .forEach(System.out::println);

    }

}



