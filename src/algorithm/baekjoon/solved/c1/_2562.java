package algorithm.baekjoon.solved.c1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _2562 {

    // 문제 : https://www.acmicpc.net/problem/2562
    // ※ 주의 : creating structure, 위치찾기는 List 특화
    // 답 - https://developerin.tistory.com/32

    // 알게된점 - 받아오는값은 int[] (scan.nextInt();)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // data
        ArrayList<Integer> list = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(s.nextLine()));
        }
        s.close();

        // max
        int max = Collections.max(list);

        // index
        int idx = list.indexOf(max) + 1;
        System.out.println(max);
        System.out.println(idx);



    }

}



