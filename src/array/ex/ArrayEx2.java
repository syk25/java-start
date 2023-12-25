package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요: ");
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(">>> ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[numbers.length-1]);
    }
}
