package chap_11.Sec06;

public class ThrowsExample {

    public static void main(String[] args) throws ClassNotFoundException {
                                            // 2. 여기서도 떠넘김 -> 그렇다면 어디로 가나 -> jvm ( 예외를 출력하고 끝냄 )
                                            // **결국 main 에서 최종 예외 처리를 해야함, jvm 으로 넘기는 것은 좋지 못한 코드..
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");         // 1.예외를 처리해야하지만 떠넘김
    }
}
