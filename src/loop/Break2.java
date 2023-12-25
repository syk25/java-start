package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (; ; ) { // while문 과 동치
            sum += i;
            i++;
            System.out.println(sum);
            if (sum > 10) {
                break;
            }
        }
    }
}
