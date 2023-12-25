package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요.");
        System.out.print(">>> ");
        int size = sc.nextInt();
        int[] numbers = new int[size];


        System.out.println(size + "의 개수를 입력하세요:");
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
