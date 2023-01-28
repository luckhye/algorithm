package algorithm.programmerse.godgjumkit;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _wijang {


    // 문제 https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java

    public static void main(String[] args) {
        _wijang sample = new _wijang();
        //[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
        String[][] test = {
                {"yellow_hat","headgear" },
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };


        sample.solution(test);
    }
//
//    public static <T> Collector<T, ?, Long>
//    counting() {
//        return reducing(0L, e -> 1L, Long::sum);
//    }

    // 제출
    public int solution(String[][] clothes) {
        // 총합
        // 분류별 조합
        // map()

        // 1. 그루핑
        // Array -> to String (:key)  -> to Map<key, Counting>
        //Optional<Long> result = Arrays.stream(clothes)
        Long result = Arrays.stream(clothes)
                //.forEach( i -> System.out.println(Arrays.toString(i)));
                //.forEach( i -> System.out.println(i[0]));

                // ~ to String ( key 추출)
                .map( i -> i[1])
                // ~ to Map
                .collect( Collectors.groupingBy(Function.identity(), Collectors.counting()) )

                // 2. 경우의 수
                // 없는 것도 같이 세주기 : 없는거 1가지
                // map to stream
                .entrySet().stream()
                // 경우의 수
                .map( i -> i.getValue() )

                // 내부구조
                .reduce(1l, (a,b) -> (a) * (b+1) );
                //.map( j -> an );


//        System.out.println("result = "+ result. get());
//        System.out.println(result);
//        return result.get().intValue() - 1;
        return result.intValue() -1;
    }

}


