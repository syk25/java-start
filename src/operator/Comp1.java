package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b); // 일치 연산자 - false
        System.out.println(a != b); // 불일치 연산자 true
        System.out.println(a > b); // 비교연산자 false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        boolean result = (a == b); // 비교결과를 변수에 담기
        System.out.println(result); // false
    }
}
