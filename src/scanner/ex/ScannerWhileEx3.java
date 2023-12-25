package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("===Hello Human===");
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = sc.nextLine();


            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            sc.nextLine(); // nextInt 로 받는 값은 10\n 형태로서 뒤의 '\n'이 남아있다. -> 버리기
            System.out.printf("입력한 이름: %s, 나이: %d \n", name, age);
        }
    }
}
