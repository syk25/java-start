package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d x %d = %d \n", number, i, number * i);
        }
    }
}
