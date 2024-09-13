package conditionalSentences;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2525_Oven_Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.nextLine();
        int afterTime = scanner.nextInt();

        int[] timeArr = Arrays.stream(timeStr.split(" ")).mapToInt(Integer::parseInt).toArray();
        LocalTime currentTime = LocalTime.of(timeArr[0], timeArr[1]);

        LocalTime alarmTime = currentTime.plusMinutes(afterTime);
        System.out.print(String.format("%d %d", alarmTime.getHour(), alarmTime.getMinute()));
    }
}