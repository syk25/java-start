package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요: ");
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(">>> ");
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double avg = (double) sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);

    }
}
