package algorithm.baekjoon.solved.c1;

import java.util.Scanner;

public class _1008 {

    // int 계산은 int 결과
    // 따라서 소수점 결과는 double 타입 계산식으로 만들어야한다.

    // 자바(java)에서 나누기(나눗셈) 연산의 이해와 BigDecimal클래스 이용 > https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=comthird&logNo=220062312090
    // 자바 정수(int)를 나누어서 소수점 값 쉽게 출력하는 법 > String to double

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String[] arr = input.split(" ");

        double result = Integer.parseInt(arr[0]) / ( Integer.parseInt(arr[1]) * 1.0 );

        s.close();
        System.out.println(result);
    }


}


