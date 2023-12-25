package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        /*
          사용자 입력을 받아 계산하는 프로그램
          1. 한번에 한개의 정수 받기
          2. 0을 입력시 사용자가 입력한 정수의 합 출력하고 종료
          */

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("===Hello 계산기===");

        while(true){
            System.out.print("정수를 입력해주세요(0 입력시 프로그램 종료): ");
            int a = sc.nextInt();
            sum += a;
            if(a == 0){
                System.out.println("총합: " + sum);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
