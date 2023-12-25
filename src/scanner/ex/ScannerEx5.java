package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자를 입력: ");
        int num1 = sc.nextInt();
        System.out.print("끝 숫자를 입력: ");
        int num2 = sc.nextInt();

        System.out.print("두 숫자 사이의 수: ");
        for (int i = num1; i < num2; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(num2);
    }
}
