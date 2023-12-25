package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // 값을 복사해서 대입하는 부분 - 변수의 주소가 아닌, 변수 내의 값이 들어가는 것
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
