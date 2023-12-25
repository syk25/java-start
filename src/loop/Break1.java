package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) { // 조건식: true -> 무한반복문
            sum += i;
            if (sum > 10000000) {
                System.out.println("합이 10 보다 크면 종료: i = " + i + " sum = " + sum);
                break; // 반복문 탈출
            }
            i++;
        }
    }
}
