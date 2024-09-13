package loopSentences;

import java.util.Scanner;

public class Main_2739_Gugudan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int plusUnit = sc.nextInt();

        for(int repeatUnit = 1; repeatUnit <= 9; repeatUnit++){
            System.out.println(String.format("%d * %d = %d", plusUnit, repeatUnit, plusUnit * repeatUnit));
        }
    }
}