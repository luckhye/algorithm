package conditionalSentences;

import java.util.Scanner;

public class Main_14681_Quadrant_Selection {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();

        boolean isQudrant1 = x > 0 && y > 0;
        boolean isQudrant2 = x < 0 && y > 0;
        boolean isQudrant3 = x < 0 && y < 0;
        boolean isQudrant4 = x > 0 && y < 0;

        if (isQudrant1) {
            System.out.println("1");
        } else if (isQudrant2) {
            System.out.println("2");
        } else if (isQudrant3) {
            System.out.println("3");
        } else if (isQudrant4) {
            System.out.println("4");
        }

    }
}