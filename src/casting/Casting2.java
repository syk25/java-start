package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 명시적 형변환 -> 소수점 버림을 감수 하겠다
    }
}
