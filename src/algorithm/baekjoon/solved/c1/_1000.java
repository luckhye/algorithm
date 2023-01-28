package algorithm.baekjoon.solved.c1;

import java.util.Scanner;

public class _1000 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;

        String input = s.nextLine();
        String[] arr = input.split(" ");

        for (String item : arr) {
            //System.out.println("item = "+ item);
            total += Integer.parseInt(item);
        }
        ;

        s.close();
        System.out.println(total);
    }


}


