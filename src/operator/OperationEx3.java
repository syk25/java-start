package operator;

import java.util.Scanner;

public class OperationEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >= 80 && score <= 100){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
