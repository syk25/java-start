package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // a = a + 3
        System.out.println(a); // a == 8

        a -= 2; // a == 6
        System.out.println(a);

        a *= 4; // a == 24
        System.out.println(a);

        a /= 3; // a == 8
        System.out.println(a);

        a %= 5;
        System.out.println(a);
    }
}
