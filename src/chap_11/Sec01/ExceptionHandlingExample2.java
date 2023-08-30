package chap_11.Sec01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data){
        try {                                   // 예외 처리 try - catch - finally 구문
                                                // 이를 통해 "프로그램 종료" 코드 실행
            int result = data.length();         // 예외 발생
            System.out.println("문자 수 : " + result);
        }
        catch(NullPointerException e) {         // 예외가 발생하면 예외 객체를 만드는데 e 가 예외 객체를 참조한다.
            // System.out.println(e.getMessage()); // 예외 객체의 예외 이유를 불러오는 코드 e.getMessage() or e.toString()
            // System.out.println(e.toString());   // 이 코드들은 예외의 정보를 불러오는 코드지, ***예외 처리 코드는 아님***
            e.printStackTrace();                // 예외를 추적하는 코드 (보통 이 코드를 많이 사용함.
        }finally {
            System.out.println("마무리 실행\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        printLength("ThisisJava");
        printLength(null);              // 일부로 예외를 만듬 (런타임 예외)

        System.out.println("프로그램 종료");   // 예외로 인해 코드가 실행되지 않음
    }
}


