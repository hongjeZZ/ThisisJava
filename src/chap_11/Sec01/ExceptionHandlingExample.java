package chap_11.Sec01;

public class ExceptionHandlingExample {
    public static void printLength(String data){
        int result = data.length();         // 예외 발생
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        printLength("ThisisJava");
        printLength(null);              // 일부로 예외를 만듬 (런타임 예외)

        System.out.println("프로그램 종료");   // 예외로 인해 코드가 실행되지 않음
    }
}


