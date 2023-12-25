package method.ex;

public class MethodExRef1 {
    public static void main(String[] args) {
        avg(1,2,3);
        avg(15, 25, 35);
    }
    public static double avg(int a, int b, int c){
        int sum = a + b + c;
        double avg = (double) sum / 3;
        System.out.println("평균값: " + avg);
        return avg;
    }
}
