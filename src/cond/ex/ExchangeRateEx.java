package cond.ex;

import java.util.Scanner;

public class ExchangeRateEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean power = true;

        while (power == true) {

            System.out.print("원화로 환전할 달러를 입력하십시오 >> ");
            int dollar = sc.nextInt();
            int exchangeToWon = dollar * 1300;
            if (dollar < 0) {
                System.out.println("잘못 된 금액입니다.");
            } else if (dollar == 0) {
                System.out.println("환전할 금액이 없습니다.");
            } else {
                System.out.println("환전 금액은 " + exchangeToWon + "원입니다.");
            }

            boolean check = true;
            while (check) {
                System.out.println("계속하시겠습니까? 1) 네 2) 아니오");
                System.out.print("입력값 >> ");
                switch (sc.nextInt()) {
                    case 1 -> {
                        power = true;
                        check = false;
                    }
                    case 2 -> {
                        power = false;
                        check = false;
                    }
                    default -> {
                        System.out.println("잘못 된 입력입니다. 다시 입력해주세요.");
                    }
                }
            }

        }
    }
}
