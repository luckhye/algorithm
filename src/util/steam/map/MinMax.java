package util.steam.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


// min / max 구하기
// A. Map의 key 값, value 값 중 최대 값을 뽑는 방법은?
// sol1> Collections.max() , Collections.min()을 사용

// B. Map의 value값 중 최대 값의 key값을 뽑는 방법은? ( + 중복일 경우도 포함)
// sol2> 최대 value값이 1개라면 간단한 방법으로 key값이 조회가 가능하지만,
// sol3> value값이 중복이고, 그 중에서 가장 큰 key값을 찾으려면 stream을 사용해야 합니다. (간단한 방법)
// sol4> 특히 최대 value값이 중복이고 모든 key값을 조회하고 싶다면, maxValue를 찾고 다시 Map을 순회해아 합니다.

public class MinMax {

    static Map<Integer, Integer> testMap;

    public static void main(String[] args){
        MinMax test = new MinMax();
        HashMap<String, Integer> testSet = test.testSet();
        System.out.println("");
        test.min(testSet);
        test.max(testSet);
        System.out.println("");
        test.keyOfmaxValue(testSet);
        System.out.println("");
        test.keyOfmaxValues(testSet);
        System.out.println("");
        test.keysOfmaxValues(testSet);
    }

    public MinMax(){

    }

    public HashMap<String, Integer> testSet() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 2);
        testMap.put("b", 3);
        testMap.put("c", 3);
        testMap.put("d", 3);
        return testMap;
    }

    // sol1
    public void min( HashMap map ) {
        System.out.println(Collections.max(map.values()));
    }

    public void max(HashMap map) {
        System.out.println(Collections.min(map.values()));
    }


    // sol2
    // 최대 value값이 1개라면 간단한 방법으로 key값이 조회가 가능하지만,
    public void keyOfmaxValue(HashMap<String,Integer> map) {
        String key = Collections.max(map.entrySet(), (m1, m2) -> m2.getValue() - m1.getValue()).getKey();
        System.out.println(key);
    }

    // sol3
    // value값이 중복이고, 그 중에서 가장 큰 key값을 찾으려면 stream을 사용해야 합니다. (간단한 방법)
    public void keyOfmaxValues(HashMap<String, Integer> map) {
        String key = map.entrySet().stream().max((m1, m2) -> m1.getValue() > m2.getValue() ? 1 : -1).get().getKey();
        System.out.println(key);
    }

    // sol4
    // 특히 최대 value값이 중복이고 모든 key값을 조회하고 싶다면, maxValue를 찾고 다시 Map을 순회해아 합니다.
    public void keysOfmaxValues(HashMap<String, Integer> map) {
        int maxValue = Collections.max(map.values());
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == maxValue) {
                System.out.println(m.getKey());
            }
        }
    }

}
