package algorithm.baekjoon.sprout;

import java.util.Scanner;

public class _2475 {

    // 문제 https://www.acmicpc.net/problem/2475
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input1 = s.nextLine();   // input

        input1 = input1.trim();
        String[] arr = input1.split(" ");
        int total = 0;
        for( String item : arr ){
            int n = Integer.parseInt(item);
            total += n * n;
        }

        System.out.println((total%10));

    }


}


