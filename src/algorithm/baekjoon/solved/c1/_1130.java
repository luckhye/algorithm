package algorithm.baekjoon.solved.c1;

import java.util.*;
import java.util.stream.Collectors;

public class _1130 {

    // 문제 https://www.acmicpc.net/problem/1330

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        // 1
        OptionalInt chai = Arrays.stream(input.split(" "))
                // String[] -> Int[]
                .mapToInt(Integer::parseInt)
                // 2 이전값 비교 -> reduce(int identity, IntBinaryOperator op);
                .reduce( (a, b) -> a - b );

        // 3
        String result = "==";
        if( chai.isPresent() ){
            if ( chai.getAsInt() > 0) {
                result = ">";
            } else if (chai.getAsInt() < 0) {
                result = "<";
            };
        };


        s.close();
        System.out.println(result);
    }


}


