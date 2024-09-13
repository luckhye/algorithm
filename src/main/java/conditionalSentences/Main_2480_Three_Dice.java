package conditionalSentences;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main_2480_Three_Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String threeDiceNNumberStr = scanner.nextLine();

        String[] threeDiceNNumberStrArr = threeDiceNNumberStr.split(" ");
        int dice1 = Integer.parseInt(threeDiceNNumberStrArr[0]);
        int dice2 = Integer.parseInt(threeDiceNNumberStrArr[1]);
        int dice3 = Integer.parseInt(threeDiceNNumberStrArr[2]);

        TreeSet<Integer> diceSet = new TreeSet(List.of(threeDiceNNumberStrArr));
        if(diceSet.size() == 1){
            System.out.println(10000 + dice1 * 1000);
        }else if(diceSet.size() == 2) {
            if(dice1 == dice2 || dice1 == dice3){
                System.out.println(1000 + dice1 * 100);
            }else if(dice2 == dice3){
                System.out.println(10000 + dice2 * 100);
            }
        }else{
            System.out.println(Integer.valueOf(diceSet.last()) * 100);
        }
    }
}