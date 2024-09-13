package iOAadBasicOperation;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2588_곱셈 {

  /**
   * 주체 : 곱셈의 내용을 풀어야하는 나
   * <p>
   * 의도 : 출력할때는 뭘쓰는지(아이디어), 곱셈의 내용을 가져올때는 뭘쓰는지(아이디어)
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    scanner.close();

     number1 = 472;
     number2 = 385;

    multiple(number1, number2);
  }

  private static void multiple(int number1, int number2) {
    Integer[] number2CharArr = Arrays.stream(String.valueOf(number2).split(""))
        .map(Integer::valueOf).toArray(Integer[]::new);

    System.out.printf("%d \n", number2CharArr[2] * number1);
    System.out.printf("%d \n", number2CharArr[1] * number1);
    System.out.printf("%d \n", number2CharArr[0] * number1);
    System.out.printf("%d", number1 * number2);
  }
}