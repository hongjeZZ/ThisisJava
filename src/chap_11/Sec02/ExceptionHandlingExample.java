package chap_11.Sec02;

// 이 예제의 핵심은 Class.forName("java.lang.String"); 이 코드를 쓰려면 처음부터 예외를 처리하는 try - catch -finally 문을
// 사용해야하고, 우리는 이런 예제를 일반 예외라고 한다.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");          // ClassNotFoundException 은 일반 예외
            // Class.forName 코드는 ()의 이름을 클래스를 찾고, 있다면 메모리에 클래스를 로딩해라 라는 메소드
            System.out.println("주어진 클래스는 있습니다.");
        } catch (ClassNotFoundException e){
            System.out.println("주어진 클래스는 없습니다.");
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");         // 예외발생
            System.out.println("주어진 클래스는 있습니다.");         // 예외로 인해 실행 X
        } catch (ClassNotFoundException e){
            System.out.println("주어진 클래스는 없습니다.");
            e.printStackTrace();
        }
    }
}
