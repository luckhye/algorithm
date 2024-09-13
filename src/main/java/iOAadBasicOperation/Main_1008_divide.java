package iOAadBasicOperation;

import java.util.Scanner;

/**
    parameter1 target : 9
    parameter2 operand : 4
    result :  2.25

    원리 : 나누는 수로 뺄셈을 반복한다.
 */

public class Main_1008_divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double dividResult = A/B;
        System.out.print(dividResult);

    }
}