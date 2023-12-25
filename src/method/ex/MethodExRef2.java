package method.ex;

public class MethodExRef2 {
    public static void main(String[] args) {
        String message1 = "Hello World1";
        String message2 = "Hello World2";
        String message3 = "Hello World3";

        repeatMessage(3,message1);
        repeatMessage(5,message2);
        repeatMessage(7,message3);
    }
    public static void repeatMessage(int n, String message){
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
        System.out.println();
    }
}
