package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===Hello 계산기====");

            System.out.println("첫번째 숫자와 두번째 숫자를 입력해주세요(둘 다 0 일 경우 종료). ");
            System.out.print("첫번째 숫자: ");
            int a = sc.nextInt();
            System.out.print("두번째 숫자: ");
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int sum = a + b;
            System.out.println("두 수의 합은 " + sum + " 입니다.");
        }
    }
}
