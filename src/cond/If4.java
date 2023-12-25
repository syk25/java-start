package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 14;
        if (age < 14) {
            System.out.println("초등학생");
        } else if (age < 18){
            System.out.println("사춘기");
        } else if (age < 34) {
            System.out.println("청년");
        } else if (age < 45) {
            System.out.println("장년");
        } else if (age < 65) {
            System.out.println("중년");
        }  else {
            System.out.println("노년");
        }
    }
}
