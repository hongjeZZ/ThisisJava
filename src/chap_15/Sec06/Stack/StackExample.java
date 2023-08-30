package chap_15.Sec06.Stack;
// LIFO = stack ; 후입선출
// stack 은 vector 를 상속받았기 때문에 동기화 처리가 되어있다.
// 즉, 멀티 스레드 환경에서 사용이 가능하다.
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

        coinBox.push(new Coin(10));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(500));

        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue());
        }
    }
}
