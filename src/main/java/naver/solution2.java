package naver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class solution2 {

  static int testNum = 1;

  public static void main(String[] args) {
    // create int array
    int S = 29162;
    int T = 10524;

    testCase(S, T, 2);
  }

  private static void testCase(int inputS, int inputT, int collectOutput) {
    int output = solution(inputS, inputT);
    if (output == collectOutput) {
      System.out.println(testNum++ + "번 정답");
    } else {
      System.out.println(
          testNum++ + "번 오답.input:" + inputS + "," + inputT + " output:" + output
              + ", collectOutput:"
              + collectOutput);
    }
  }

  public static int solution(int SNum, int TNum) {
    // Implement your solution here
    List<SwapMap> swapMaps = new ArrayList<>();
    String S = Integer.toString(SNum);
    String T = Integer.toString(TNum);
    int n = S.length();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
          String[] newS = S.split("");
          String[] newT = T.split("");

          // Swap elements at index i
          String tempS = newS[i];
          String tempT = newT[i];
          newS[i] = newT[j];
          newT[i] = newS[j];
          newS[j] = tempT;
          newT[j] = tempS;

          // Count swaps (for this problem, always 1)
          int swapCount = i + 1;

          swapMaps.add(new SwapMap(String.join("", newS), String.join("", newT), swapCount));
        }
      }
    }

    swapMaps.sort(Comparator.comparingInt((SwapMap sm) -> Math.abs(sm.S - sm.T))
        .thenComparingInt(sm -> sm.swapCount));

    return swapMaps.stream().findFirst().get().swapCount;
  }


  static class SwapMap {
    int S;
    int T;
    int swapCount;

    SwapMap(String S, String T, int swapCount) {
      this.S = Integer.valueOf(S).intValue();
      this.T = Integer.valueOf(T).intValue();
      this.swapCount = swapCount;
    }
  }



}