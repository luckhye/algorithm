package loopSentences;

import java.util.Scanner;

public class Main_25314_Coding_is_Physical_Education {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biteSize = sc.nextInt();

        int x = (int) biteSize / 4;
        System.out.println("long ".repeat(x) + "int");
    }
}