package loopSentences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_10950_Basic_Operation {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int testCaseCount = Integer.parseInt(reader.readLine());

    for (; testCaseCount > 0; testCaseCount--) {
      String plusUnitsStr = reader.readLine();
     IntStream plusUnitArray = Arrays.stream(plusUnitsStr.split(" ")).mapToInt(Integer::parseInt);
      int sum = plusUnitArray.sum();

      System.out.println(sum);
    }
  }
}