package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            System.out.println(sum);
            if (sum > 10) {
                break;
            }
        }
    }
}
