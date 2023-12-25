package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // 작은 범위 -> 큰 범위
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // 작은 범위 - > 큰 범위
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // 작은 범위 -> 큰 범위
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
