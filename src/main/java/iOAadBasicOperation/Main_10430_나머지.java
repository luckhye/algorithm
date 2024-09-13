package iOAadBasicOperation;

import java.util.Arrays;
import java.util.Scanner;

public class Main_10430_나머지 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputStr = scanner.nextLine();

    Integer[] numberArray = Arrays.stream(inputStr.split(" ")).map(Integer::valueOf)
        .toArray(Integer[]::new);
    int A = numberArray[0];
    int B = numberArray[1];
    int C = numberArray[2];

    System.out.println((A + B) % C);
    System.out.println(((A % C) + (B % C)) % C);
    System.out.println((A * B) % C);
    System.out.print(((A % C) * (B % C)) % C);
  }
}