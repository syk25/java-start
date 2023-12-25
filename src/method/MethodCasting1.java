package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // 컴파일 오류 발생
        printNumber((int) number); // 형변환으로 값을 int 에 맞게 버림 - 명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
