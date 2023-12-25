package method;

public class MethodRef1 {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("sum1 = " + sum1);


        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("sum2 = " + sum2);
    }

    public static int add(int a, int b){
        System.out.println("더하기 연산 수행을 합니다.");
        return a + b;
    }
}
