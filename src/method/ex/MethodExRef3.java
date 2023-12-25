package method.ex;

public class MethodExRef3 {
    public static void main(String[] args) {

        int balance = 10000;
        int depositAmount = 1000;
        int withdrawAmount = 2000;

        balance = deposit(balance,depositAmount);
        balance = withdraw(balance,withdrawAmount);
        printBalance(balance);

    }
    static int deposit(int balance, int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입급하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    static int withdraw(int balance, int withdrawAmount) {
        if(balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
    static void printBalance(int balance){
        System.out.println("최종 잔액 " + balance + "원");
    }
}
