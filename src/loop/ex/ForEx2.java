package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

        for (int number = 2, count = 1; count <= 10 ; number+= 2, count++) { // 변수를 여러 개 사용 가능
            System.out.println(number);
        }
    }
}
