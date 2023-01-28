package algorithm.baekjoon.solved.c1;

import java.util.Scanner;

public class _1152 {

    // 예외처리 필요 - 앞 공백, 띄어쓰기


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        input = input.trim();
        int result = 0;
        if( !input.equals("") ){
            String[] arr = input.split(" ");
            result = arr.length;
        };

        s.close();
        System.out.println(result);
    }


}


