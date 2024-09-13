package naver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

  public int solution(String S, String T) {
    List<SwapMap> swapMaps = new ArrayList<>();
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
