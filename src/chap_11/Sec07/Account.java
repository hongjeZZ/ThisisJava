package chap_11.Sec07;

public class Account {
    // field
    private long balance;
    // new
    public Account(){}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money)  {
            throw new InsufficientException("잔고부족; " + (money - balance)+"원이 모자람" );
            // 잔고 부족 시 예외를 발생시킴. 이 예외 처리는 메소드에서 하지 않음 (일반적으로)
            // 이 메소드를 호출한 메인 메소드로 떠넘김 throws.
        }
        balance -= money;
    }
}
