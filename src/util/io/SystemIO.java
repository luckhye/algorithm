package util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemIO {
    public SystemIO() {
    }

    public static void main(String[] args) throws IOException {
        scanner_auto();
    }

    public static void scanner() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Scanner 종료");
    }

    public static void bufferReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("BufferReader 종료");
    }

    public static ArrayList scanner_auto() {
        Scanner s = new Scanner(System.in);
        ArrayList lineList = new ArrayList();

        while (s.hasNext()) {
            String l = s.nextLine();
            if (l.equals("end")) {
                System.out.println("end!");
                s.close();
                break;
            }

            lineList.add(l);
        }

        System.out.println("lineList = " + lineList);
        return lineList;
    }

    public static String[] scanner_space() {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        return line.split(" ");
    }
}
