package iOAadBasicOperation;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11382_꼬마정민 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String threeNumberStr = scanner.nextLine();
        scanner.close();

        long plusResult = Arrays.stream(threeNumberStr.split(" "))
                .mapToLong(Long::parseLong)
                .sum();

        System.out.print(plusResult);

    }
}