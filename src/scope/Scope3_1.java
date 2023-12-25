package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10; // m  생존 시작
        int temp = 0; // if 문 밖에서 선언 됨
        if(m > 0){
            temp = m * 2;
            System.out.println("temp: " + temp); // 조건 충족시 temp 변수 사용
        }
        System.out.println(m); // m 사용
    } // m, temp 생존 종료
}
