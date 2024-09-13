package naver;

import java.util.Arrays;
import java.util.Optional;

public class test {

  static int testNum = 1;

  public static void main(String[] args) {
    // create int array
    int[] input = new int[]{1, 2, 3, 5};
    testCase(input, 4);

    int[] input2 = new int[]{1, 3, 6, 4, 1, 2};
    testCase(input2, 5);

    int[] input3 = new int[]{1, 2, 3};
    testCase(input3, 4);

    int[] input4 = new int[]{-1, -2};
    testCase(input4, 1);
  }

  private static void testCase(int[] input, int collectOutput) {
    int output = solution(input);
    if (output == collectOutput) {
      System.out.println(testNum++ + "번 정답");
    } else {
      System.out.println(
          testNum++ + "번 오답.input:" + Arrays.toString(input) + " output:" + output + ", collectOutput:"
              + collectOutput);
    }
  }

  public static int solution_origin(int[] A) {
    // Implement your solution here
    return Arrays.stream(A).filter(a -> a > 0)
        .sorted()
        .filter(a -> !Arrays.stream(A).anyMatch(arrayItem -> arrayItem == a + 1))
        .map(a -> a + 1)
        .findFirst()
        .orElse(Optional.of(Arrays.stream(A).max().getAsInt()).map(num -> num < 1 ? 1 : num + 1).get());

  }

  public static int solution(int[] A) {
    // Implement your solution here
    return Arrays.stream(A).filter(a -> a > 0)
        .sorted()
        .distinct()
        .reduce(1, (missing, curr) -> missing == curr ? missing + 1 : missing);

  }

}