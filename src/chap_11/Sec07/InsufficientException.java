package chap_11.Sec07;
// 사용자 정의 예외
public class InsufficientException extends Exception {
                                    // 여기서 RuntimeException 을 부모로 삼으면 실행 예외를 만드는 것.
    public InsufficientException(){}
    public InsufficientException(String message){
        super(message);
    }
}
