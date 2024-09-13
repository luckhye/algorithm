package loopSentences;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main_8393_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int finalPlusUnit = sc.nextInt();

        IntStream rangeToPlus = IntStream.range(1, finalPlusUnit + 1);
        int rangeSum = rangeToPlus.sum();

        System.out.println(rangeSum);
    }
}