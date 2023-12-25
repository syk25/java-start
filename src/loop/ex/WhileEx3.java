package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 1;
        while(max <= 100){
            sum += max;
            max++;
            System.out.println(sum);
        }
    }
}
