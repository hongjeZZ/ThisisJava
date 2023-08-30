package chap_12.Sec04.exam01;

public class ErrExample {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        }
        catch (NumberFormatException e){
            System.err.println("- 에러 내용 -");        // out 대신 err 로 사용하여 빨간색 에러내용으로 출력
            System.err.println(e.getMessage());
        }
    }
}
