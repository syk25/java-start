package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        System.out.print(">>> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println(size + "개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(">>> ");
            numbers[i] = sc.nextInt();
        }

        bubbleSort(numbers);
        System.out.println("가장 작은 정수: " + numbers[0]);
        System.out.println("가장 큰 정수: " + numbers[numbers.length -1]);
    }

    static void bubbleSort(int[]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i -1; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
