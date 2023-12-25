package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) { // 조건이 3일 때
                i++;
                continue; // 조건이 3일 때 이후 코드는 넘기고 다음 반복문 순환 실행
            }
            System.out.println(i);
            i++;
        }
    }
}
