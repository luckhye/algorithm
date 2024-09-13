package loopSentences;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main_25304_Receipt {
    public static void main(String[] args) throws IOException {

        // forForSentence();
        forStreamSentence();
    }

    public static void forForSentence() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.valueOf(bufferedReader.readLine());
        int productTypeCount = Integer.valueOf(bufferedReader.readLine());
        int totalProductTypePrice = 0;
        for(; productTypeCount > 0; productTypeCount--){
            String productInfoToPriceStr = bufferedReader.readLine();
            int productPrice = Arrays.stream(productInfoToPriceStr.split(" ")).mapToInt(Integer::parseInt).reduce(1, (a, b) -> a * b);
            totalProductTypePrice += productPrice;
        }
        boolean isEqaulTotalPrice = totalPrice == totalProductTypePrice;
        System.out.println(isEqaulTotalPrice ? "Yes" : "No");
    }

    public static void forStreamSentence() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.valueOf(bufferedReader.readLine());
        int productTypeCount = Integer.valueOf(bufferedReader.readLine());
        int totalProductTypePrice = IntStream.range(1, productTypeCount + 1)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                        return "";
                    }
                })
                .mapToInt(str -> Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).reduce(1, (a, b) -> a * b))
                .sum();

        boolean isEqaulTotalPrice = totalPrice == totalProductTypePrice;
        System.out.println(isEqaulTotalPrice ? "Yes" : "No");
    }
}