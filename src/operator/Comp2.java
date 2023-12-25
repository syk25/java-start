package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result = str1.equals(str2);
        boolean result2 = "Hello".equals("Hello");

        System.out.println("result = " + result); // false 출력
        System.out.println("result2 = " + result2); // true 출력
    }
}
