package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;
        int repeatLimit = 100;

        while(count < repeatLimit){
            count += 1;
            System.out.println("현재 숫자는: " + count);
        }

    }
}
