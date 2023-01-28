package algorithm.baekjoon.sprout;

import java.util.Scanner;

public class _10807 {

    // 문제 https://www.acmicpc.net/problem/1157
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String cnt = s.nextLine();   // 개수
        String input1 = s.nextLine();   // input
        String v = s.nextLine();   // v

        input1 = input1.trim();
        String[] arr = input1.split(" ");
        int total = 0;
        for( String item : arr ){

            if(item.equals(v)){
                total++;
            }
        }
        System.out.println(total);

    }


}


