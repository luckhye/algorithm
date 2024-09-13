package iOAadBasicOperation;

import java.util.Arrays;
import java.util.Scanner;

public class Main_10869_forBasicOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String intStr = sc.nextLine();
        int[] intArray = Arrays.stream(intStr.split(" "))
                .mapToInt(Integer::parseInt)
            .toArray();

        int A = intArray[0];
        int B = intArray[1];

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.print(A % B);
    }
}