package cond.ex;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        System.out.print("홀짝을 판별할 숫자를 입력하세요 >> ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String numberType = number % 2 == 0 ? "짝수" : "홀수";
        System.out.println(number + "는 " + numberType + " 입니다.");
    }
}
