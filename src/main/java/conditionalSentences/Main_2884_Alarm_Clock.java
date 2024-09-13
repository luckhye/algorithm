package conditionalSentences;

import java.time.LocalTime;
import java.util.Scanner;

public class Main_2884_Alarm_Clock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.nextLine();
        scanner.close();

        String[] timeArr = timeStr.split(" ");

        String hour = timeArr[0];
        String minute = timeArr[1];

        LocalTime currentTime = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minute));
        LocalTime alarmTime = currentTime.minusMinutes(45);

        String alramStringTime= String.format("%d %d", alarmTime.getHour(), alarmTime.getMinute());

        System.out.println(alramStringTime);
    }
}