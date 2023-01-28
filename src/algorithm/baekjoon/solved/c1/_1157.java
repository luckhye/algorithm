package algorithm.baekjoon.solved.c1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _1157 {

    // 문제 https://www.acmicpc.net/problem/1157

    // 최다수
    // 1 데이터 요건 - 대소문자 무관

    // 2 데이터 저장 - 데이터 샛 Map
        // getOrDefault 메서드 : 디폴트옵션있는 조회문
        // put 메서드 : update 메서드

    // 3 최다수 로직
        //


    // (X) 결과
        // 3 최다수 로직 - map쪽 stream api 사용
        // 한 map을 적절히 이용해 문제가 원하는 key값과 value값을 꺼낼 수 있어야 합니다



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        // 1
        input = input.toUpperCase();

        // 2
        String[] strArr = input.split("");
        HashMap<String, Integer> cntInfo = new HashMap();
        for (String str : strArr) {
            int cnt = cntInfo.getOrDefault(str,0);
            cnt += 1;
            cntInfo.put(str, cnt );
        };

        // 3
        int maxValue = Collections.max(cntInfo.values());
        List maxEntryList = cntInfo.keySet().stream()
                .filter( key -> cntInfo.get(key) == maxValue )
                .collect(Collectors.toList());

        // 예외처리 - 여러개면 "?"반환, 한개면 한개반환
        String result = "?";
        if( maxEntryList.size() == 1 ){
            result = maxEntryList.get(0) + "";
        };

        s.close();
        System.out.println(result);
    }


}


