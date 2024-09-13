package conditionalSentences;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1330_Compare_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String compareCntStr = scanner.nextLine();

        int[] cntArr = Arrays.stream(compareCntStr.split(" ")).mapToInt(Integer::parseInt)
            .toArray();
        int leftCnt = cntArr[0];
        int rightCnt = cntArr[1];

        boolean isEqualValue = leftCnt - rightCnt == 0;
        boolean isMoreValue = leftCnt - rightCnt > 0;
        if(isEqualValue){
            System.out.println("==");
            return;
        }

        if(isMoreValue){
            System.out.println(">");
            return;
        }

        System.out.println("<");
    }
}