package cond.ex;

import java.util.Scanner;

public class GradeSwitchEx {
    public static void main(String[] args) {
        System.out.print("학점을 입력하십시오 >> ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        System.out.println("grade: " + "\"" + grade + "\"");
        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다.");
            case "B" -> System.out.println("좋은 성과입니다.");
            case "C" -> System.out.println("준수한 성과입니다.");
            case "D" -> System.out.println("향상이 필요합니다.");
            case "F" -> System.out.println("불합격입니다.");
            default -> System.out.println("잘못된 학점입니다.");
        }
    }
}
