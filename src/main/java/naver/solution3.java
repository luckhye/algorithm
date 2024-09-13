package naver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class solution3 {

  static int testNum = 1;

  public static void main(String[] args) {
    System.out.println(solution("abbabba"));;

  }

//  private static void testCase(int[] input, int collectOutput) {
//    int output = solution(input);
//    if (output == collectOutput) {
//      System.out.println(testNum++ + "번 정답");
//    } else {
//      System.out.println(
//          testNum++ + "번 오답.input:" + Arrays.toString(input) + " output:" + output
//              + ", collectOutput:"
//              + collectOutput);
//    }
//  }

  public static int solution(String S) {
    String[] sItemArray = S.split("");
    Set<String> prefixSet = new HashSet<>();
    Set<String> suffixSet = new HashSet<>();

    // Generating prefix set
    Arrays.stream(sItemArray)
        .reduce("", (prev, curr) -> {
          prefixSet.add(prev);
          return prev + curr;
        });

    // Generating suffix set
    List<String> reversS = Arrays.asList(sItemArray);
    Collections.reverse(reversS);
    System.out.println("reversS :"+reversS.toString());
    reversS.stream()
        .reduce("", (prev, curr) -> {
          suffixSet.add(prev);
          return curr + prev;
        });

    Set<String> commonItems = new HashSet<>(prefixSet);
    commonItems.retainAll(suffixSet);

    String maxLenS = commonItems.stream()
        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())) // Sort by length descending
        .findFirst().get();

    return Optional.ofNullable(maxLenS).map(String::length).orElse(0);

  }

}