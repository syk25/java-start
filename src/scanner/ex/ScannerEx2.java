package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요: ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.printf("입력한 숫자 %d 는 짝수입니다.",a);
        } else {
            System.out.printf("입력한 숫자 %d 는 홀수입니다.",a);
        }

    }
}
