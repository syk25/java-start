package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 틀 준비
        System.out.print("학생 수를 입력 받으세요: ");
        int size = sc.nextInt();
        int[][] students = new int[size][3];
        String[] subjects = {"국어","영어","수학"};



        // 학생들의 성적 입력
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번의 학생의 성적을 입력하세요:");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                students[i][j] = sc.nextInt();
            }
        }

        // 학생들의 총점과 평균 출력
        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }
            double avg = (double) total / students[i].length;
            System.out.printf("%d 학생의 총점: %d, 평균: %.2f \n", i+1, total, avg);
        }
    }
}
