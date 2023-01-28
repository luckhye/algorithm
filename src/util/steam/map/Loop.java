package util.steam.map;

import java.util.HashMap;
import java.util.Map;




public class Loop {

    // Map의 요소들을 순회하는 방법은?
    // 1. key 순회
    // 2.value 순회
    // 3. key , value 동시 순회

    // sol
    //  1 -> key를 순회할 때는 keySet()
    //  2 -> value를 순회할 때는 values()
    //  3 -> key, value를 순회할 때는 entrySet()

    // etc
    //    참고로 다른, 형태는 보다시피
    //    Set()형태로 반환하는데 values()의 반환형은 Collection입니다 .
    //
    //    Collection은 List, Set, Queue와 같은 Collection, interface의 클래스들 중 하나 입니다.
    //    add(),remove(),clear(),size() 등으 메소드 사용이 가능합니다.
    //
    //    Collections는 Collection을 조작할 때 사용하는 유용한 클래스로 sort()가 대표적이며 min(), max()도 있습니다.

    static Map<Integer, Integer> testMap;

    public static void main(String[] args){

        Loop testLoop = new Loop();
        HashMap<String, Integer> testSet = testLoop.testSet();
        testLoop.keyLoop(testSet);
        testLoop.valueLoop(testSet);
        testLoop.entryLoop(testSet);

    }

    public Loop(){

    }

    public HashMap<String, Integer> testSet(){
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 2);
        testMap.put("b", 3);
        testMap.put("c", 3);
        testMap.put("d", 3);
        return testMap;
    }

    // 1. key 순회
    public void keyLoop( HashMap<String, Integer> map ) {
        for ( Object key : map.keySet()) {
            System.out.println(key);
        }
    }

    // 2. key 순회
    public void valueLoop(HashMap<String,Integer> map) {
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }


    // 3. entrySet 순회
    public void entryLoop(HashMap<String,Integer> map) {
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

}
