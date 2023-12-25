package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        // 리팩토링
        int[] students = {60, 50, 70, 90, 80}; // 선언과 동시에 배열의 초기화
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "의 점수: " + students[i]);
        }
    }
}
