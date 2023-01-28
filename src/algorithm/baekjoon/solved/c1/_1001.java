package algorithm.baekjoon.solved.c1;

import java.util.Scanner;

public class _1001 {

    // -= 누적됨

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;

        String input = s.nextLine();
        String[] arr = input.split(" ");

        total = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);

        s.close();
        System.out.println(total);
    }


}


