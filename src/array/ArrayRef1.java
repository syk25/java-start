package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // int 배열변수의 선언
        students = new int[5]; // 배열을 생성 후 그 참조값을 배열 변수에 저장

        // 배열의 요소에 값 대입
        students[0] = 60;
        students[1] = 80;
        students[2] = 90;
        students[3] = 70;
        students[4] = 50;

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i]);
        }
    }
}
