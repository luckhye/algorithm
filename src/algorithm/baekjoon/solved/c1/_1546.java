package algorithm.baekjoon.solved.c1;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _1546 {

    // ※ 주의 : int형으로 나눌 경우 소숫점에 의해 값이 0으로 나오기 때문에 float형으로 해주어야 함
    // 답 - https://nirsa.tistory.com/358

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer N = Integer.parseInt(s.nextLine());
        String input = s.nextLine();
        s.close();

        //1. creating intStream
        Stream<Float> streamFloatArr = Arrays.stream(input.split(" "))  //1) String to Array to creating arrayStream
                .map(Float::parseFloat); // 2) converting String to parseFloat

        // 2. max
        Float max = streamFloatArr
                .max(Comparator.comparing(x -> x)).get();

        // 2. average
        Float avg = Arrays.stream(input.split(" "))
                .map(Float::parseFloat)
                .reduce( 0F, (total,n) ->  total + (  n / max  * 100 / N )  );


        System.out.println(avg);
    }


}



