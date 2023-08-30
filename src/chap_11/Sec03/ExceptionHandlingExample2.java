package chap_11.Sec03;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {

        String[] array = {"100","1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                System.out.println(array[i]);
                int value = Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 항목이 있습니다. 다시 확인해 주세요.");
            } catch (Exception e) {
                System.out.println("항목수가 부족합니다. 다시 확인해주세요.");
            }
            // Exception 은 우선순위가 제일 먼저이기 때문에 catch 문에서 먼저 사용하면 모든 예외가 Exception 에서 처리됨
            // 그러면 다른 예외 처리문에서 오류가 남.
            // 그래서 특정 예외 처리를 먼저 catch 문으로 쓰고 나머지를 Exception 이용하여 처리하자.
        }
    }
}
