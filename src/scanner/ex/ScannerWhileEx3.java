package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.\n입력을 중단하려면 -1 을 입력하세요. ");
        int sum = 0;
        int count = 0;
        int number;

        while((number = sc.nextInt()) != -1){ // 조건을 축약적으로 표현
            System.out.print(">>>> ");
                sum += number;
                count++;
        }

        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);

    }
}
