package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        // 리팩토링
        int[] students;
        students = new int[]{60, 50, 70, 90, 80}; // 초기화를 하는 다른 방법
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수: " + students[i]);
        }
    }
}
