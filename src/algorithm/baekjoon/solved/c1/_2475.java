package algorithm.baekjoon.solved.c1;

import java.util.*;

public class _2475 {

    // 문제 https://www.acmicpc.net/problem/1157

    // map putIfAbsent 메서드 > 있으면 저장후 키 반환 , 없으면 저장후 null 반환

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        // input 요건에 맞게 가공 - 대소문자 무관
        input = input.toLowerCase();
        // input 요건에 맞게 가공2 - 저장
        HashMap<String,Integer> cntInfo = new HashMap();
        String[] strArr = input.split("");
        for(String str : strArr ){
            int cnt = cntInfo.get(str);
            cntInfo.putIfAbsent(str, cnt++ );
        };

        String maxEntry = cntInfo.keySet().stream()
                .max(Comparator.comparing(cntInfo::get))
                .orElse(null);

        s.close();
        System.out.println(maxEntry);
    }


}


