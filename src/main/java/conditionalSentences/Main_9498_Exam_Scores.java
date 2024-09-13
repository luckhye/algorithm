package conditionalSentences;

import java.util.Scanner;

public class Main_9498_Exam_Scores {
    public static void main(String[] args) {
        int score;

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        scanner.close();

        if( score >= 90 && score <= 100){
            System.out.println("A");
        }else if(score >= 80 && score <= 89){
            System.out.println("B");
        }else if(score >= 70 && score <= 79){
            System.out.println("C");
        }else if(score >= 60 && score <= 69){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}