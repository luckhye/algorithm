package conditionalSentences;

import java.util.Scanner;

public class Main_2753_Leap_Year {
    public static void main(String[] args) {
        int currentYear;

        Scanner scanner = new Scanner(System.in);
        currentYear = scanner.nextInt();

        boolean is400Mutiple = currentYear % 400 == 0;
        boolean is100Mutiple = currentYear % 100 == 0;
        boolean is4Mutiple = currentYear % 4 == 0;

        boolean isYearToSunFromMoon = is4Mutiple && (!is100Mutiple || is400Mutiple);
        if(isYearToSunFromMoon){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}