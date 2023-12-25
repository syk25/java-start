package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    static Scanner sc = new Scanner(System.in);
    static int balance = 0;

    public static void main(String[] args) {

        while (true) {
            switch (chooseMenu()) {
                case 1 -> balance = deposit();
                case 2 -> balance = withdraw();
                case 3 -> checkBalance();
                case 4 -> {
                    printFooter();
                    return; // break 대신에 return 문 쓰기
                }
                default -> printError();
            }
        }
    }

    static int chooseMenu() {
        System.out.println("------------------------");
        System.out.println("1.입금|2.출금|3.잔액 확인|4.종료");
        System.out.println("------------------------");
        System.out.print("선택: ");
        return sc.nextInt();
    }

    static int deposit() {
        System.out.print("입금액을 입력하세요: ");
        int depositAmount = sc.nextInt();
        balance += depositAmount;
        System.out.println(depositAmount + "을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    static int withdraw() {
        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = sc.nextInt();
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    static void checkBalance() {
        System.out.println("현재 잔액: " + balance + "원");
    }

    static void printFooter() {
        System.out.println("시스템을 종료합니다.");
    }

    static void printError() {
        System.out.println("잘못 번호를 입력하였습니다.");
    }
}
