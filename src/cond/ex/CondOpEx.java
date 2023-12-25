package cond.ex;

import java.util.Scanner;

public class CondOpEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a 값을 입력 하세요 >> ");
        int a = sc.nextInt();
        System.out.print("b 값을 입력 하세요 >> ");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        System.out.printf("%d 와 %d 중 더 큰 숫자는 %d 입니다.\n", a, b, max);

    }
}
