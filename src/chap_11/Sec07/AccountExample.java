package chap_11.Sec07;

import java.io.Serializable;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(30000);           // 여기서 10000원을 넘지 않는 금액이더라도 일반 예외로 생성하였기 때문에
        } catch (InsufficientException e){            // 컴파일이 불가능하다.
           String message = e.getMessage();
           System.out.println(message);
        }

        System.out.println("예금액 : " + account.getBalance());
    }
}
