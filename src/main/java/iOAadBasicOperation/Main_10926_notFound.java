package iOAadBasicOperation;

import java.util.Scanner;

public class Main_10926_notFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        //byPlusOperation(id);
//        byStringBuffer(id);
        byString(id);
    }

    private static void byPlusOperation(String id) {
        System.out.print(id + "??!");
    }

    private static void byStringBuffer (String id) {
        System.out.println(String.join("", id, "??!"));
    }

    private static void byString (String id) {
        System.out.println(new String(id + "??!"));
    }
}